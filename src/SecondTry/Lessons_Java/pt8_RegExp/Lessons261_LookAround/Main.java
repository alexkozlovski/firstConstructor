package SecondTry.Lessons_Java.pt8_RegExp.Lessons261_LookAround;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        //(?=(regeex)reg)
        //loockahead
//        Pattern p1=Pattern.compile("q(?=u)");//(?=regex) - \\1 ищет u после q
        Pattern p1=Pattern.compile("\\w*q(?!u)");// ищет чтобы после q небыло u
        Matcher m1=p1.matcher("Iraq");
        check(m1,1);

        //loockbehind
//        Pattern p2=Pattern.compile("(?<!a)b");//zeroLENGTH найти b перед которой не будет буквы а
        Pattern p2=Pattern.compile("(?<=a)b");//zeroLENGTH найти b перед которой не будет буквы а
        Matcher m2=p2.matcher("cb");
//        Matcher m2=p2.matcher("cab");
        check(m2,2);



//        Pattern p3=Pattern.compile("\\b\\w+(?<!s)\\b");
        Pattern p3=Pattern.compile("\\b\\w*[^s\\W]\\b");
//        Pattern p3=Pattern.compile("\\b\\w*[^s\\W]\\b");
        Matcher m3=p3.matcher("John's");
        check(m3,3);
    }
    public static void check(Matcher m,int num){
        while (m.find()) System.out.println("P/M №"+num+" start at "+m.start()+" pos ["+m.group()+"]");
    }
}
