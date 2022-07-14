package lesson7;

public class MainTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setA(8);
        triangle.setB(6);
        triangle.setC(9);
        triangle.setH(4);
        System.out.println("Периметр треугольника: "+triangle.getperimetr());
        System.out.println("Площадь треугольника: "+triangle.getarea());
    }
}
