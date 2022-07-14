package lesson5;

import java.util.Scanner;

import static lesson5.StringOperations.*;

/**
 * Метод принимает входящими параметрами текст,
 * и возвращает кол-во гласных букв в тексте
 */
public class Homework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = in.nextLine();
        System.out.println("Количество гласных в тексте: "+ countVowlLetters(str));
    }
}
