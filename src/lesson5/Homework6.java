package lesson5;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        /**
         * В метод передаем сумму депозита,
         * банковский процент и кол-во лет,
         * и метод возвращает значение прироста процентов
         * которые мы заберем с банка через столько лет
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму депозита");
        String num1 = sc.nextLine();
        System.out.println("Введите количество лет");
        String num2 = sc.nextLine();
        System.out.println("Введите банковский процент");
        String num3 = sc.nextLine();
        double money =Double.parseDouble(num1);
        int years = Integer.parseInt(num2);
        double procent = Double.parseDouble(num3);
        System.out.println("Через " + years + " лет , вы заберете: ");
        NumericOperations.gainInterest(money,years,procent);

    }
}
