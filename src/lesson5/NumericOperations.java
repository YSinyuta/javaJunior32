package lesson5;

public class NumericOperations {
    public static void printSquare(int h, int l) {

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }

        return;
    }

    public static void printMinNumber(int a, int b, int c) {
        if (a == b || b == c || c == a) {
            System.out.println("Есть повторяющиеся числа");
            return;
        }
        if (a < b && a < c) {
            System.out.println("Наименьшее число " + a);
        } else if (b < c && b < a) {
            System.out.println("Наименьшее число " + b);
        } else {
            System.out.println("Наименьшее число " + c);
        }
    }

    public static void gainInterest(double money,int years,double procent){
        for(int month = 0;month<12*years;month++){
          money = money+((money/100*procent)/12);
        }
        System.out.println(money);

    }

}
