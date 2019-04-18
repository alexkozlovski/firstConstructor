package SecondTry.Lessons_Java.pt8_RegExp.Lessons247_bukvalnie_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 28.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[aA]");//наъодит все буквы Аа
        Matcher m=p.matcher("Ale2x go3od bo12y and what?");
        while (m.find()) System.out.print(m.start()+"-"+m.group()+" ");
        System.out.println("\n____________________");

        Pattern p2=Pattern.compile("cat");//находит слово cat в предложениии
        Matcher m2=p2.matcher("many cats dont't wanna die");
        while (m2.find()) System.out.print(m2.start()+" "+m2.group()+"    ");
        System.out.println("\n____________________");


        //special chararacters - metacharacters
        //[]\^$.|?*+()

        Pattern p3=Pattern.compile("\\Q1+1=2\\E");// \\Q...\\E воспринимает буквально что внутри от QдоE
        Pattern p31=Pattern.compile("1\\+1=2");
        Matcher m3=p3.matcher(".. 1+1=2");
        while (m3.find()) System.out.println(m3.start()+"   "+m3.group()+"  ");
        System.out.println("1+1=2".matches(p31.pattern()));
        System.out.println("\n___________________");


        Pattern p4=Pattern.compile("cat");
        Matcher m4=p4.matcher("He captured a catfish for his cat.");
        while (m4.find()) System.out.print(m4.start()+"    "+m4.group()+"  ");

    }
}
