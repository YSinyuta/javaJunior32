package lesson2;

public class Homework3 {
    public static void main(String[] args) {
        /**
         * Напечатать на консоль кол-во четных
         * чисел в диапазоне от 30 до 61
         */
        int kol = 0;
        for(int i = 30;i<=61;i++){
            if(i%2==0)
                kol++;}
        System.out.println(kol);
    }
}
