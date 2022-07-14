package lesson7;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(57);
        System.out.println("Площадь круга"+circle.getarea());
        System.out.println("Периметр круга" + circle.getperimetr());
    }
}
