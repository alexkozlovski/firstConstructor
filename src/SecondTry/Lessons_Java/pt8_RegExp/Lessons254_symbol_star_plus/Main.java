package SecondTry.Lessons_Java.pt8_RegExp.Lessons254_symbol_star_plus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 30.09.2018.
 */
public class Main {
    public static void main(String[] args) {

        //{1,} это как плюсик, т.е. от одного до бесконечности
        //{0,} это как звездочка, т.е. от нуля до бесконечности
        //{2,}от двух до бесконечности
        //{2} конкретно 2, не больше и не меньше
        Pattern p1=Pattern.compile("<[A-Za-z][A-Za-z0-9]*");//+
        Pattern p11=Pattern.compile("<[A-Za-z][A-Za-z0-9]*");//+
        Matcher m1=p1.matcher("<h1>");
        Matcher m11=p11.matcher("<a>");
        while(m1.find()) System.out.print(m1.start()+"  "+ m1.group()+" ");
        System.out.println("");
        while(m11.find()) System.out.print(m11.start()+"  "+ m11.group()+" ");
        System.out.println("");


        Pattern p2=Pattern.compile("\\b[1-9][0-9]{3}\\b");
        Matcher m2=p2.matcher("1000 9999 19999");
        while (m2.find()) System.out.print(m2.start()+"   "+m2.group()+"    ");
        System.out.println("");


//        Pattern p3=Pattern.compile("<.+>");
//        Pattern p3=Pattern.compile("<.+?>");
        Pattern p3=Pattern.compile("<[^>]+>");

        Matcher m3=p3.matcher("this is a <EM tag>and<nextTag> pooo");

        while (m3.find()) System.out.print(m3.start()+"   "+m3.group()+"    ");
        System.out.println("");



    }
}
