package lesson2;

public class Main {
    public static void main(String[] args) {
        /**
         * у нас есть 3 стороны треугольника
         * напечатать на консоль какой вид треугольника:
         * разносторонний, равнобедренный или равносторонний
         */
        int a = 15;
        int b = 14;
        int c = 5;

        //управляющая консоль

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольнрик");
        }
    }
}
