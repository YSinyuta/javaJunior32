package lesson5;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        /**
         * В метод передаем кол-во строк и кол-во колонок,
         * метод печатает на консоль квадрат из единичек по этим параметрам
         */

        System.out.println("Введите высоту строк и количество колонок: ");
        Scanner sc = new Scanner(System.in);
        String row = sc.nextLine();
        String columns = sc.nextLine();
        int h=Integer.parseInt(row);
        int l=Integer.parseInt(columns);
        NumericOperations.printSquare(h,l);


    }
}
