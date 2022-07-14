package lesson7;

public class Main {
    public static void main(String[] args) {
        Tovar table1 = new Tovar();
        Tovar table2 = new Tovar();

        //table1.id = 12345;//поскольку данные закрыты, мы должны написать метод
        //который будет менять значение id

        table1.setId(12345);
        table1.setFullPrice(12000);


    }
}
