package lesson3;

public class Main1 {
    public static void main(String[] args) {
        /**
         * создать массив в 10 ячеек
         * и наполнить его четными числами от 30 и далее
         */
        int[] numbers = new int[10];

        int even = 30;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = even;
            even += 2;
        }
    }
}
