package lesson5;

public class Main1 {
    public static void main(String[] args) {

        MathOperations.printTypeOfTriangle(4,5,6);

        double ploshad1 = MathOperations.areaOfTriangle(2,4,7);
        double ploshad2 = MathOperations.areaOfTriangle(4,5);
       if (ploshad1>ploshad2){
           System.out.println("первый треугольник больше");
       } else if(ploshad1<ploshad2) {
           System.out.println("второй треугольник больше");
       }else {
           System.out.println("Треугольники равны");
       }
    }
}
