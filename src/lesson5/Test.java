package lesson5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test {
    public static void main(String args[]) {
        //Reading String from user
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //Regular expression
        String regex = "[\\p{Punct}]";
        //Compiling the regular expression
        Pattern pattern = Pattern.compile(regex);
        //Retrieving the matcher object
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while(matcher.find()) {
            count++;
        }
        System.out.println("Number of punctuation marks: "+count);
    }
}
