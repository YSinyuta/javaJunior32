package lesson3;

public class Homework3 {
    public static void main(String[] args) {
        /**
         * есть массив цифр, вывести на консоль все числа в обратном порядке.
         * При этом дважды вывести те числа, которые являются кратными трем
         */

        int[] numbers = {6, 5, 7, 3, 10, 22, 15, 19};

        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 3 == 0) {
                System.out.println(numbers[i]);
            }
            System.out.println(numbers[i]);
        }
    }
}
