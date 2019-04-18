package SecondTry.Source_Code.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lessons6_Pattern_Matcher {
    public static void main(String[] args) {
        String text="some text";
        System.out.println(Pattern.matches("some",text));
        Pattern pattern=Pattern.compile("some text");
        Matcher matcher=pattern.matcher(text);
        System.out.println(matcher.matches());

    }
}
