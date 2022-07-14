package lesson1;

public class Main2 {
    public static void main(String[] args) {
        /**
         * Есть число, нужно понять оно четное или нет
         */
        int number = 15;
        //всегда остается или 0 (четное) или 1 (не четное)
        int ostatok = number % 2;
        boolean isChetnoe = ostatok == 0;//true or false
        System.out.println(isChetnoe);
    }
}
