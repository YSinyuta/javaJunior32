package lesson4;

public class Main1 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][4];
        for (int i = 0;i<numbers.length;i++){
            for(int j = 0;j < numbers[i].length;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }


    }
}
