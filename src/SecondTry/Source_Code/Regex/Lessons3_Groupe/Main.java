package SecondTry.Source_Code.Regex.Lessons3_Groupe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        //Pattern p1=Pattern.compile("(\\d+)");// поиск одного или нескольких цифровых символов
        Pattern p1=Pattern.compile("(\\d+).*\\1");// любые цифры которые повторяются много раз
        Matcher m1=p1.matcher("2017 year. 2018 year. 2019 year.");
        check(m1,1);
    }    public static void check(Matcher m,int num){
        while (m.find()) System.out.println("№"+num+" start at "+m.start()+" pos ["+m.group()+"]");
    }

}
