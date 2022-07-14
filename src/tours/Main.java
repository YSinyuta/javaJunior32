package tours;

public class Main {
    public static void main(String[] args) {
        Tour tour1 = new Tour(1,6,"самолет",5,120000,"Полупансионат");
        Tour tour2 = new Tour(2, 8, "самолет", 5, 100000, "завтрак");
        Tour tour3 = new Tour(3,12,"автобус",3,80000,"полупансион");

        tour1.addCountry("Италия");
        tour2.addCountry("Франция");
        tour3.addCountry("Грузия");
        tour3.addCountry("Армения");
        System.out.println();

    }
}
