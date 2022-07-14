package lesson5;

public class MathOperations {

    /**
     * создать метод, в который мы передаем 3 стороны треугольнкиа
     * а метод будет печатать на консоль какой это треугольник
     */

    /**
     * 1- модификатор доступа(или регулировка области видимости данного метода):
     * бывает 4 варианта:
     * public (доступ внутри всего проекта),
     * private (доступ внутри текущего файла),
     * ---- - видимость внутри текущего пакета(папки) + его наследникам данного файла,
     * protected (внутри текущего файла + его наследникам)
     * <p>
     * 2 - static(или есть или нет,без привязки к.-либо объекту)
     * 3 - возвращаемый тип (void команда без обратного ответа)
     * 4 - название метода
     * 5 - входящие параметры
     * 6 - тело выполнения метода
     */

    public static void printTypeOfTriangle(int a, int b, int c) {
        if (a + b <= c || b + c <= a || c + a <= b) {
            System.out.println("Такого треугольника не существует");
            return;
        }
        if (a == b && b == c && c == a) {
            System.out.println("равносторонний треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("разносторонний треугольник");
        } else {
            System.out.println("это равнобедренный треугольник");
        }
    }

    /**
     * В метод мы передаем 3 стороны треугольника
     * и метод Возвращает значение площади треугольника
     */

    public static double areaOfTriangle(int a, int b, int c){
        double p = 0.5 * (a+b+c);
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
    public static double areaOfTriangle(int osnovanie, int visota){
        double s = 0.5 * osnovanie * visota;
        return s;
    }
}
