package SecondTry.Source_Code.Regex.Lessons2_Literals_and_metasymbols;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        Pattern p1=Pattern.compile("[a-e]$");
        Matcher m1=p1.matcher("a d b c d e f g h");
        check(m1,1);
        Matcher m2=p1.matcher("f g h a b c");
        check(m2,2);
        System.out.println("a b c d e".matches("^[a-e]"));

    }
    public static void check(Matcher m,int num){
        while (m.find()) System.out.println("№"+num+" start at "+m.start()+" pos ["+m.group()+"]");
    }
}
