package lesson5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        /**
         * В метод передаем 3 числа,
         * метод должен вернуть меньшее число из 3х
         */
        System.out.println("Введите 3 числа: ");
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        String num3 = sc.nextLine();
        int a =Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);
        NumericOperations.printMinNumber(a,b,c);

    }
}
