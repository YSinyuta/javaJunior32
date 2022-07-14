package lesson2;

public class Main5 {
    public static void main(String[] args) {
        /**
         * напечатать на консоль от 30 до 100 числа кратные на 3 и 5
         */

        for (int i = 30; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
