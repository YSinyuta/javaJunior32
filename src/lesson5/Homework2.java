package lesson5;

import java.util.Scanner;

/**
 * Метод принимает входящими параметрами текст,
 * печатает на консоль этот же текст,
 * только в обратном порядке
 */
public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Введите текст: ");
        Scanner in = new Scanner(System.in);
        String rev = in.nextLine();
        System.out.println(StringOperations.reverseString(rev));
    }
}
