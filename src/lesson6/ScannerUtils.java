package lesson6;

import java.util.Scanner;

public class ScannerUtils {
    //метод будет возвращать страну куда хочет поехать пользователь
    public static String getInputCountry(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите страну поездки: ");
        String country = scanner.nextLine();
        return country;
    }

    //метод будет возвращать цены от и до
    public static int getPriceFrom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость тура От: ");
        String sumFrom = scanner.nextLine();
        return Integer.parseInt(sumFrom);
    }
    public static int getPriceTo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стоимость тура До: ");
        String sumTo = scanner.nextLine();
        return Integer.parseInt(sumTo);
    }
}

