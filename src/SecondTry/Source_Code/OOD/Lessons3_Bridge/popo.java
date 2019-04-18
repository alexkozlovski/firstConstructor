package SecondTry.Source_Code.OOD.Lessons3_Bridge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 16.10.2018.
 */
public class popo {
    public static void main(String[] args) {
        String s="1222";
//        Pattern pattern=Pattern.compile("\\p{Punct}*^\\b\\b$");
        Pattern pattern=Pattern.compile("1");
        Matcher matcher=pattern.matcher("s");
        while (matcher.find()) System.out.println(matcher.group());
    }
}
