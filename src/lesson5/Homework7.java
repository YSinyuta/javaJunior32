package lesson5;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        /**
         * В метод передаем email, метод должен вернуть true или false подходит нам email или нет.
         * Подходит: когда содержит @, когда нет пробелов,
         * когда часть текста после @ содержит в себе точку
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String inputPassword = scanner.nextLine();
        EmailUtils.containsSymbols(inputPassword);
    }
}
