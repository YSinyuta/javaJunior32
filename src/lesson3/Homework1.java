package lesson3;

public class Homework1 {
    public static void main(String[] args) {
        /**
         * Вывести на консоль сколько в массиве четных цифр
         */

        int[] numbers = {6, 5, 7, 3, 10, 22, 15, 19};
        int numberEvens = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numberEvens++;
            }
        }
        System.out.println(numberEvens);
    }
}
