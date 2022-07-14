package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Мы-Турагенство,
         * программа отображает правильный набор тур в зависимости от
         * желаний человека
         */
        String[][] tours = {{"1", "Италия", "5 дней", "Самолет", "5 звезд", "120000", "Полупансион"},
                {"1", "Италия", "5 дней", "Самолет", "5 звезд", "120000", "завтрак"},
                {"2", "Франция", "8 дней", "Самолет", "5 звезд", "100000", "завтрак"},
                {"3", "Грузия, Армения", "12 дней", "автобус", "3 звезды", "80000", "Полупансион"},
                {"4", "Армения", "4 дней", "автобус", "4 звезды", "70000", "Пансионат"},
                {"5", "Англия", "7 дней", "Самолет", "5 звезд", "150000", "Полупансион"},
                {"6", "Швеция, Дания", "14 дней", "автобус", "4 звезды", "180000", "пансионат"},
                {"7", "Корея", "21 день", "Самолет", "5 звезд", "200000", "завтрак"},
                {"8", "Япония", "21 день", "Самолет", "5 звезд", "250000", "Пансионат"},
                {"9", "Перу, Чили", "9 дней", "автобус", "3 звезды", "300000", "Полупансион"},
                {"10", "Канада", "14 дней", "Самолет", "5 звезд", "150000", "Полупансион"}};

        System.out.println("Добрый день.Выберите действие: ");
        System.out.println("1 - Узнать среднюю стоимость тура в определенную страну");
        System.out.println("2 - Узнать среднюю стоимость любого тура");
        System.out.println("3 - Вывести туры в определенную страну");
        System.out.println("4 - Вывести туры ценой от и до ");
        System.out.println("5 - Вывести туры +- 2 дня от введенной длительности в опред страну ");
        System.out.println("6 - Вывести выгодные туры до 10 тыщ/сутки ");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("1")) {
            String country = ScannerUtils.getInputCountry();
            int averagePrice = TourUtils.getAveragePriceByCountry(tours, country);
            System.out.println("Средняя стоимость: " + country + "=" + averagePrice);

        } else if (answer.equals("2")) {
            int allaveragePrice = TourUtils.getAveragePriceAnyCountry(tours);
            System.out.println("Средняя стоимость тура : =" + allaveragePrice);

        } else if (answer.equals("3")) {
            String country = ScannerUtils.getInputCountry();
            System.out.println("Туры в " + country + ":");
            TourUtils.printToursByCountry(tours, country);
        } else if (answer.equals("4")) {
            int sumFrom = ScannerUtils.getPriceFrom();
            int sumTO = ScannerUtils.getPriceTo();
            System.out.println("Туры по цене от :" + sumFrom + "и до " + sumTO);
            TourUtils.getRelatedTours(tours,sumFrom,sumTO);
        }
    }
}

