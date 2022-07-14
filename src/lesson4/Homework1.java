package lesson4;

public class Homework1 {
    public static void main(String[] args) {
        /**
         * вывести обратную диагональ в двухмерном массиве единичками,
         * а остальное ноликами
         */
        int[][] numbers = new int[8][8];

        for(int i = 0;i< numbers.length;i++){
            for(int j = 0;j<numbers[i].length;j++){
               if(i+j== numbers.length - 1){
                   System.out.print("1 ");
               }else{
                   System.out.print("0 ");
               }
            }
            System.out.println();
        }
    }
}
