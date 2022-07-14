package lesson2;

public class Main2 {
    public static void main(String[] args) {
        /**
         * есть оценка которую принес ученик со школы
         * нужно напечатать на консоль: Отлично или Хорошо или
         * НЕ очень или Плохо или Это не оценка,
         * в зависимости от оценки которую нам принесли
         */
        int mark = 1;
        if (mark == 5) {
            System.out.println("Great");
        } else if (mark == 4) {
            System.out.println("Good");
        } else if (mark == 3) {
            System.out.println("Not well");
        } else if (mark == 2) {
            System.out.println("Bad");
        } else {
            System.out.println("That's not a mark");
        }
    }
}
