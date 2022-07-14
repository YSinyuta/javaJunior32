package lesson10;

public interface IPlayer {

    /**
     * интерфейс это набросок будущего класса
     * 1. Объект данного интерфейса создать нельзя
     * 2. Все методы без тела,т.е. являются набросками того что должно быть внутри класса
     * 3.
     */
    void addCardToHand(Card card);

    boolean needsCard ();

    void openHand();

    void setName(String name);

}
