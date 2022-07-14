package lesson3;

public class Homework2 {
    public static void main(String[] args) {
        /**
         * есть массив цифр. вывести на консоль все числа с массива,
         * которые больше 10,но меньше 25
         */

        int[] numbers = {6, 5, 7, 3, 10, 22, 15, 19};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 10 && numbers[i] < 25)
                System.out.println(numbers[i]);
        }
    }
}
