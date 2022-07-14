package lesson5;

import java.util.concurrent.ThreadLocalRandom;

public class Saperutils {
    public static void addMine(int[][] fields, int maxIndexRow, int maxIndexCol){
        int randomRowIndex = ThreadLocalRandom.current().nextInt(maxIndexRow);
        int randomColIndex = ThreadLocalRandom.current().nextInt(maxIndexCol);
        if(fields[randomColIndex][randomRowIndex]!=-1){
            fields [randomColIndex][randomRowIndex]=-1;
    }else {
            addMine(fields,maxIndexRow,maxIndexCol);
}    }
}
