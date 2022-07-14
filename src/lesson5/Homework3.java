package lesson5;

import java.util.Scanner;

import static lesson5.StringOperations.*;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringOperations.countMarks(input);


    }
}
