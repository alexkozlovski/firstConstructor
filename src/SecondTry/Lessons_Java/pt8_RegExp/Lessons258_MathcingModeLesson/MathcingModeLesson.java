package SecondTry.Lessons_Java.pt8_RegExp.Lessons258_MathcingModeLesson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class MathcingModeLesson {
    public static void main(String[] args) {
        Pattern p1=Pattern.compile("a",Pattern.CASE_INSENSITIVE);
        //Pattern p1=Pattern.compile("A#this is commet",Pattern.COMMENTS);
        Matcher m1=p1.matcher("A");
        while(m1.find()) System.out.println(m1.start()+"    "+m1.group());
        System.out.println("A".matches("(?i)a"));
        System.out.println("AA".matches("(?i)a(?-i)a"));
        System.out.println("AAA".matches("(?i)a(?-i:A)a"));
    }
}
