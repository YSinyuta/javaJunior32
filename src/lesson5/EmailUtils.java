package lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUtils {
    public static void containsSymbols(String inputPassword) {
        String pattern = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        if (inputPassword.matches(pattern)) {
            System.out.println("Пароль действителен");
        }
        else {
            System.out.println("Пароль недействителен");
        }
    }
}





