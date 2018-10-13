package SecondTry.Lessons_Java.pt8_RegExp.Lessons262_MultipleRequirements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        //Word 6 letters and have a "cat"
        //cat\w{3}|\wcat\w{2}cat\w|w\w{3}cat
        //1 b\w{6}|b
        //2 \b\w*cat\w*cat\w*\b
        //(?=\b\w{6}\b)\b\w*cat\w*\b
        //(?=\b\w{6}\b)\w*cat\w*
        //(?=\b\w{6}\b)\w{0,3}cat\w*
        //\b(?=\w{6)\b)\w{0,3}cat\w*
        Pattern p1=Pattern.compile("(?=\\b\\w{6}\\b)\\w*cat\\w*");
        Matcher m1=p1.matcher("wecate");
        check(m1,1);


        //word 6-12 letter should have cat or dog or mouse
        Pattern p2=Pattern.compile("\\b(?=\\w{6,12}\\b)\\w{0,9}(cat|dog|mouse)\\w*");
        Matcher m2=p2.matcher("aweacatdgee");
        check(m2,2);

    }
    public static void check(Matcher m,int num){
        while (m.find()) System.out.println("P/M №"+num+" start at "+m.start()+" pos ["+m.group()+"]");
    }

}
