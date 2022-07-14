package lesson6;

import static java.lang.String.valueOf;

public class TourUtils {

    public static int getAveragePriceByCountry(String[][] tours, String countryBy) {
        int allPricesByCountry = 0;
        int countTour = 0;
        for (int i = 0; i < tours.length; i++) {
            // Франция Армения,Грузия
            String countriesFromCurrentTour = tours[i][1];
            //убрать запятые между слов
            countriesFromCurrentTour = countriesFromCurrentTour.replace(",", "");
            //разбили на массив стран
            String[] countries = countriesFromCurrentTour.split(" ");
            // проверили наличе страны в туре
            if (TourUtils.findCountry(countries, countryBy)) {
                //считаем количество туров с такой страной
                countTour++;
                //наращиваем на переменную стоимость туров
                allPricesByCountry = allPricesByCountry + Integer.parseInt(tours[i][5]);

            }
        }
        return allPricesByCountry / countTour;
    }

    private static boolean findCountry(String[] countries, String countryBy) {
        //for each (для каждого)
        for (String c : countries) {
            if (countryBy.equals(c)) {
                return true;
            }
        }
        return false;
    }


    public static void printToursByCountry(String[][] tours, String country) {
        for (int i = 0; i < tours.length; i++) {
            String countries = tours[i][1];
            countries = countries.replace(",", "");
            String[] countr = countries.split(" ");
            if (TourUtils.findCountry(countr, country)) {
                TourUtils.printTours(tours, i);
            }

        }

    }

    private static void printTours(String[][] tours, int i) {
        System.out.printf("Тур: %s,на %s,%s,%s,за %s,%s \n",
                tours[i][1], tours[i][5], tours[i][4], tours[i][2], tours[i][6], tours[i][3]);
    }

    public static int getAveragePriceAnyCountry(String[][] tours) {
        int allPrices = 0;
        int countTours = 0;
        for (int i = 0; i < tours.length; i++) {
            countTours++;
            allPrices = allPrices + Integer.parseInt(tours[i][5]);
        }
        return allPrices / countTours;
    }

    public static void getRelatedTours(String[][] tours, int sumFrom, int sumTO) {
        for (int i = 0; i < tours.length; i++) {
            String price = tours[i][5];
            int pricetour = Integer.parseInt(price);
            if (pricetour >= sumFrom && pricetour <= sumTO) {
                TourUtils.printTours(tours, i);
            }
        }

    }
}
