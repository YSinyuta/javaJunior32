package lesson5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringOperations {

    public static int countVowlLetters(String str) {
        int vowel = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'а' || str.charAt(i) == 'и' ||
                    str.charAt(i) == 'у' || str.charAt(i) == 'э' ||
                    str.charAt(i) == 'о' || str.charAt(i) == 'ы') {
                vowel++;
            }
        }
        return vowel;
    }

    public static String reverseString(String str) {
        char[] ch;
        ch = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }

    public static void countMarks(String args) {
        String regex = "[\\p{Punct}]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(args);
        int count = 0;
        while(matcher.find()) {
            count++;
        }
        System.out.println("Количество знаков препинания: " + count);

    }

}



