package lesson4;

import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Minesweeper {
    public static void main(String[] args) {
        System.out.println("Выберите уровень игры: ");
        System.out.println("1-Новичок");
        System.out.println("2-Любитель");
        System.out.println("3-Профессионал");
        System.out.println("4-Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();
        int[][] fields = null;

        if (level.equals("1") || level.equalsIgnoreCase("новичок")) {
            fields = new int[9][9];

            for (int mina = 0; mina < 10; mina++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(9);
                int randomColIndex = ThreadLocalRandom.current().nextInt(9);
                fields[randomRowIndex][randomColIndex] = -1;
            }
        }

        if (level.equals("2") || level.equalsIgnoreCase("любитель")) {
            fields = new int[16][16];

            for (int mina = 0; mina < 40; mina++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
                int randomColIndex = ThreadLocalRandom.current().nextInt(16);
                fields[randomRowIndex][randomColIndex] = -1;
            }
        }
        if (level.equals("3") || level.equalsIgnoreCase("профессионал")) {
            fields = new int[16][30];

            for (int mina = 0; mina < 99; mina++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(16);
                int randomColIndex = ThreadLocalRandom.current().nextInt(30);
                fields[randomRowIndex][randomColIndex] = -1;
            }
        }
        if (level.equals("4") || level.equalsIgnoreCase("Особый")) {
            System.out.println("Введите ширину поля: ");
            String width = scanner.nextLine();
            System.out.println("Введите высоту поля: ");
            String height = scanner.nextLine();
            System.out.println("Введите количество мин: ");
            String amountOfMines = scanner.nextLine();

            int intWidth = Integer.parseInt(width);
            int intHeight = Integer.parseInt(height);
            int intAmountOfMines = Integer.parseInt(amountOfMines);

            fields = new int[intWidth][intHeight];

            for (int mina = 0; mina < intAmountOfMines; mina++) {
                int randomRowIndex = ThreadLocalRandom.current().nextInt(intWidth);
                int randomColIndex = ThreadLocalRandom.current().nextInt(intHeight);
                fields[randomRowIndex][randomColIndex] = -1;
            }
        }
        //печатаем поле с минами
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                if (fields[i][j] == -1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
