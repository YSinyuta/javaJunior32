package lesson1;

public class Homework {
    public static void main(String[] args) {
        int total = 1000;
        int pricepizza = 230;
        int pricegum = 26;
        double pricecandy = 2.5;

        int pizza = total/pricepizza;
        int ostatok1 = total%pricepizza;
        int gum = ostatok1/pricegum;
        int ostatok2 = ostatok1%pricegum;
        double candy = ostatok2/pricecandy;
        double balance = ostatok2%pricecandy;

        System.out.println("На эти деньги мы можем купить: ");
        System.out.println(pizza + "пиццы");
        System.out.println(gum + "жвачки");
        System.out.println(candy + "конфет");
        System.out.println("Сдача с магазина: "+ balance + "рубля");
    }
}
