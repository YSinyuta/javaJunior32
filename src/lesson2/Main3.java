package lesson2;

public class Main3 {
    public static void main(String[] args) {
        /**
         * есть оценка которую принес ученик со школы
         * нужно напечатать на консоль: Отлично или Хорошо или
         * НЕ очень или Плохо или Это не оценка,
         * в зависимости от оценки которую нам принесли
         */

        int mark = 5;

        switch (mark) {
            case 5:
                System.out.println("Great");
                break;
            case 4:
                System.out.println("Goodt");
                break;
            case 3:
                System.out.println("Not well");
                break;
            case 2:
                System.out.println("Bad");
                break;
            default:
                System.out.println("That's not a mark");
        }
    }
}
