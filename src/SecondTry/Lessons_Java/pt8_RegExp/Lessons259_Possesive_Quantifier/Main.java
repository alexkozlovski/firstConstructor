package SecondTry.Lessons_Java.pt8_RegExp.Lessons259_Possesive_Quantifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        //*+ ++ ?+
        Pattern p1=Pattern.compile("\"[^\"]*+\"");//without +-symbol it will be GREEDY(with POSSESIVE)
        Matcher m1=p1.matcher("\"abc\"");
        check(m1,1);

        Pattern p2=Pattern.compile("\".*+\"");//possesive не найдет, но работает быстрее. пойдет до конца строки и нихера не запомнит и назад не пойдет
        //Pattern p2=Pattern.compile("\".*\"");greedy
        Matcher m2=p2.matcher("\"abc\"x");
        check(m2,2);

        //atomic group
        //X8+ -(>X*)
//        Pattern p3=Pattern.compile("(?:a|b)*+b");
//        Pattern p3=Pattern.compile("(?>(?:a|b)*)b");
        Pattern p3=Pattern.compile("(?>a|b)*b");
        Matcher m3=p3.matcher("b");
        check(m3,3);

    }
    public static void check(Matcher matcher,int number){
        while (matcher.find()){
            System.out.println("Pattern/Matcher № "+number+" start at "+matcher.start()+" position - ["+ matcher.group()+"] and end at "+matcher.end()+" pos.");
        }
    }
}
