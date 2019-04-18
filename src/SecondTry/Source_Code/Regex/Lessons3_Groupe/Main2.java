package SecondTry.Source_Code.Regex.Lessons3_Groupe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main2 {
    public static void main(String[] args) {
        Pattern p1=Pattern.compile("(?:Mouse|Keyboard|)Listener");
        Matcher m1=p1.matcher("MouseListener KeyboardListener");
        check(m1,1);

        Pattern p2=Pattern.compile("Java (?=7|8)",Pattern.CASE_INSENSITIVE);
        Pattern p21=Pattern.compile("Java (?!7|8)",Pattern.CASE_INSENSITIVE);//несоответсвие наперед
        Matcher m2=p2.matcher("Java 7 java 8");
        Matcher m21=p2.matcher("java 9");
        Matcher m22=p21.matcher("java 9");
        check(m2,2);
        check(m21,21);
        check(m22,22);



    }
    public static  void check(Matcher m, int num){
        System.out.println("______["+num+"]______");
        while (m.find()) System.out.println(m.start()+" "+m.group());
    }
}
