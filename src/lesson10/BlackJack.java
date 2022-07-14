package lesson10;

import com.sun.jdi.Value;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;

public class BlackJack implements IBlackJack {

    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>();

    @Override
    public void addPlayerToGame(Player player) {
        if (players.size() < 9) {
            players.add(player);
        } else {
            System.out.println("Нет свободных мест, простите");
        }
    }

    @Override
    public void dealTwoCardsToAllPlayers() {
        for (Player p : players) {
            p.addCardToHand(koloda.getRandomCard());
            p.addCardToHand(koloda.getRandomCard());

        }

    }

    @Override
    public void dealRestCardsToAllPlayers() {
        for (Player p : players) {
            while (p.needsCard()) { //проявление полиморфизма
                p.addCardToHand(koloda.getRandomCard());
            }
        }

    }

    public void printWinner() {
        //пройдемся по всем игрокам и "выключим" из списка победителей
        for (Player p : players) {
            if (p.valuesHand() > 21) {
                p.setCanWin(false);
            }
        }
        //если у всех перебор,ищем крупье и говорим что он победитель
        if (countPlayersWhoCanWin() == 0) {
            for (Player p : players) {
                if (p instanceof Dealer) {
                    System.out.println("Победил крупье!!!");
                    p.openHand();
                    return;
                }
            }
        }
        //находим балл победителя

        int valueWinner = 0; //находит макс значение
        for(Player p:players){
            if(p.isCanWin() && p.valuesHand()>valueWinner){
                valueWinner = p.valuesHand();
            }
        }
        //находим игроков у которых совпал балл с баллом победителя
        for(Player p:players){
            if(p.valuesHand()==valueWinner){
                System.out.println("Победитель: "+p.getName());
                p.openHand();
            }
        }
    }

    public int countPlayersWhoCanWin() {
        int count = 0;
        for (Player p : players) {
            if (p.isCanWin()) {
                count++;
            }
        }
        return count;
    }
}









