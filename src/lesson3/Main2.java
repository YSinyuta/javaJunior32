package lesson3;

public class Main2 {
    public static void main(String[] args) {
        /**
         * есть массив чисел, нужно вывести на консоль
         * сумму только четных чисел этого массива
         */
        int[] numbers = {5, 7, 8, 3, 4, 1, 9, 2};
        int sumEvensNum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                 sumEvensNum=sumEvensNum+numbers[i];
            }
        }
        System.out.println(sumEvensNum);
    }
}
