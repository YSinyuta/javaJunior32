package lesson3;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        /**
         * Нам пользователь задал пароль
         * Нам нужно напечатать на консоль пароль нам подходит или нет.
         * Пароль подходит,если:
         * -он содержит более 8 символов
         * -он содержит цифру в себе
         * - он содержит Большую букву
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String inputPassword = scanner.nextLine();

        char[] charFromPassword = inputPassword.toCharArray();

        if (charFromPassword.length < 8) {
            System.out.println("Длина пароля меньше 8 символов!");
            return;
        }

        int countnumbers = 0;
        for (int i = 0; i < charFromPassword.length; i++) {
            if (charFromPassword[i] == '0' || charFromPassword[i] == '1' || charFromPassword[i] == '2'
                    || charFromPassword[i] == '3' || charFromPassword[i] == '4' || charFromPassword[i] == '5' ||
                    charFromPassword[i] == '6' || charFromPassword[i] == '7' || charFromPassword[i] == '8' ||
                    charFromPassword[i] == '9') {
                countnumbers++;
            }
        }
          if(countnumbers == 0) {
              System.out.println("В пароле нет чисел");
          }

    }
}
