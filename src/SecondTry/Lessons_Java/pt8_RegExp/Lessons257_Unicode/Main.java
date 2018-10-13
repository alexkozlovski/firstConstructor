package SecondTry.Lessons_Java.pt8_RegExp.Lessons257_Unicode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 08.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\u0061\u0300");
        System.out.println("\u00E0");

        Pattern p1=Pattern.compile("\u00E0");
        Matcher m1=p1.matcher("à");
        while (m1.find()) System.out.println(m1.start()+"   "+m1.group());
        //\p{} L-uncidoe letter M-ASCII letter and symbol pf ne wline Z-any space
        //S - symbol(dollar etc.) N-number P-punctuation C-other, invisible character, unused code point
        Pattern p2=Pattern.compile("\\p{M}");
        Matcher m2=p2.matcher("à 1");
        while (m2.find()) System.out.println("m2=("+m2.start()+"   "+m2.group()+")   ");

        Pattern p3=Pattern.compile("à", Pattern.CANON_EQ);//найдет одинаковые. здесь à одним символом
        Matcher m3=p3.matcher("à");//здесь à - двумя
        while (m3.find()) System.out.println(m3.start()+"   "+m3.group());

    }
}
