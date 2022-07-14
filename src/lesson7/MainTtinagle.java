package lesson7;

public class MainTtinagle {
    public static void main(String[] args) {
        AtSchoolTriangle triangle = new AtSchoolTriangle();
        //в метод всегда передается 2 типа параметров
        //явные(передаются в метод в виде вход. параметов)
        // и не явные (тот объект у которого вызван данный метод-
        //-> внутри метода доступен
        triangle.setA(7);
        triangle.setB(6);
        triangle.setC(10);

        AtSchoolTriangle triangle2 = new AtSchoolTriangle(5,5,5);
        triangle2.setA(6);
        triangle2.setB(7);
        triangle2.setC(4);

        System.out.println(triangle.perimetr());
        System.out.println(triangle2.perimetr());
    }
}
