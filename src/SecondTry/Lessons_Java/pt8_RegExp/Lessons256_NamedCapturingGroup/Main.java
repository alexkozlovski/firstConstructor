package SecondTry.Lessons_Java.pt8_RegExp.Lessons256_NamedCapturingGroup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 08.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("abc".replaceAll("(?<Alleter>a)","${Alleter}-"));//(?P<name>group) (?P=name)

        Pattern p1=Pattern.compile("<(?<tag>[A-Z][A-Z0-9]*)[^>]*>.*?</\\k<tag>>");
        Matcher m1=p1.matcher("this is a <EM> test1</EM> task1_Two_Sum");
        while (m1.find()) System.out.println("start at "+m1.start()+" pos   ["+m1.group()+"]   end at "+m1.end()+" pos   ");

        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)","$1$2$3$4"));
        System.out.println("abcd".replaceAll("(a)(?<x>b)(c)(?<y>d)","$1${x}$3${y}"));
    }
}
