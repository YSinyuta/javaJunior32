package lesson2;

public class Homework4 {
    public static void main(String[] args) {
        /**
         * посчитать сколько нужно лет, чтобы собрать сумму в 200т руб
         * если откладывать ежемес по 9500
         */
        int goal = 200000;
        int invest = 9500;
        int months = 0;

        for(int i = 0;i<=goal;i = i+invest){
            months++;
        }
        int years = months/12;
        int month = months%12;
        System.out.println("Для этого нужно: "+ years+"год и "+ month + "месяцев");
    }
}
