package lesson3;

public class Main3 {
    public static void main(String[] args) {
        /**
         * Есть массив символов, вывести на консоль весь массив
         * в обратном порядке
         */

        char [] symbols = {'%','g','&','f'};

        for(int i = symbols.length - 1;i>=0;i--){
            System.out.println(symbols[i]);
        }
    }
}
