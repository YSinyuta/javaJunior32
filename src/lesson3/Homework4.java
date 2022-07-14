package lesson3;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        /**
         * есть массив цифр, вывести на консоль только те числа,
         * которые содержат в себе символ 4
         */

        int [] numbers = {6, 5, 7, 4, 10, 22, 15, 19};

        for (int i = 0;i<numbers.length;i++){
            String currentNumFromMassive = Integer.toString(numbers[i]);
            int startIndex4 = currentNumFromMassive.indexOf('4');
            if(startIndex4!= -1){
                System.out.println(currentNumFromMassive);
            }
        }
    }
}
