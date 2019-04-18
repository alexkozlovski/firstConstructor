package SecondTry.Lessons_Java.pt8_RegExp.Lessons248_Characters_classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 28.09.2018.
 */
public class Main {
    public static void main(String[] args) {
       // System.out.println("abc".matches("[]"));
        Pattern p=Pattern.compile("[a-b]");
        Matcher m=p.matcher("abc");
        while (m.find()) System.out.println(m.start()+" "+m.group()+"   ");
        System.out.println("\n__________");


        Pattern p2=Pattern.compile("gr[ae]y");//находит grEy grAy
        Matcher m2=p2.matcher("0123_gray");
        while (m2.find()) System.out.print(m2.start()+"   "+m2.group()+"  ");
        System.out.println("\n__________");



        Pattern p3=Pattern.compile("q[^a-z]");
        Matcher m3=p3.matcher("Iraq is country ");
        Matcher m31=p3.matcher("Iraqu sansai");

        while (m3.find()) System.out.println("m3-"+m3.start()+"   "+m3.group()+"");
        System.out.println();
        while (m31.find()) System.out.println("m31-"+m31.start()+" "+m31.group());
        System.out.println("\n___________________");

        Pattern p4=Pattern.compile("[*+]");
        Matcher m4=p4.matcher("1+1=2");
        while (m4.find()) System.out.print("m4-"+m4.start()+"   "+m4.group()+"  ");
        System.out.println("\n___________________");


        Pattern p5=Pattern.compile("[x^]");
        Matcher m5=p5.matcher("01234^67x9x^");
        while (m5.find()) System.out.print("m5-"+m5.start()+"   "+m5.group()+"  ");
        System.out.println("\n___________________");



        Pattern p6=Pattern.compile("\\Q[\\-]\\E");
        Matcher m6=p6.matcher("\\-[]");
        while (m6.find()) System.out.print("m6 "+m6.start()+" "+m6.group());
        System.out.println("\n___________________");


        Pattern p7=Pattern.compile("\\d");
        Matcher m7=p7.matcher("asd 2");
        while (m7.find()) System.out.print("m7  "+m7.start()+"  "+m7.group());
        // . Any character (may or may not match line terminators)
        //\d 	A digit: [0-9]
        //\D 	A non-digit: [^0-9]
        //\s 	A whitespace character: [ \t\n\x0B\f\r]
        //\S 	A non-whitespace character: [^\s]
        //\w 	A word character: [a-zA-Z_0-9]
        //\W 	A non-word character: [^\w]
        System.out.println("\n___________________");
        Pattern p71=Pattern.compile("\\d\\s");
        Matcher m71=p71.matcher("asd 2");//найдет пробел и цифру
        while (m71.find()) System.out.println("m71"+m71.start()+"   "+m71.group());
        System.out.println("\n___________________");


        Pattern p8=Pattern.compile("[\\d]+");
        Matcher m8=p8.matcher("1+1=2");
        while (m8.find()) System.out.println("m8 "+m8.start()+" "+m8.group());


    }
}
