package SecondTry.Source_Code.Regex.Lessons1_IntroduceInRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-z]+");//plus
        Matcher m=p.matcher("dswe");
        check(m);
    }
    public static void check(Matcher m){
        while (m.find()) System.out.println(m.start()+" ");
    }
}
