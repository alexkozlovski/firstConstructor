package SecondTry.Lessons_Java.pt8_RegExp.Lessons266_examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 11.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        Pattern p1=Pattern.compile("ab",Pattern.MULTILINE);
        Matcher m1=p1.matcher("abaaaba \nab aba");
        check(m1,1);

        Pattern p2=Pattern.compile("aba");
        Matcher m2=p2.matcher("abababa");
        check(m2,2);

//        Pattern p3=Pattern.compile("\\d");
        Pattern p3=Pattern.compile("\\d+");
        Matcher m3=p3.matcher("a31asd3e56f2");
        check(m3,3);
        Pattern p4=Pattern.compile("\\w");
        Matcher m4=p4.matcher("12 aa sds  s d 3 a");
        check(m4,4);
        Pattern p5=Pattern.compile("proj1([^,])*");
        Matcher m5=p5.matcher("porj3.txt,proj1sched.pdf,proj1,proj2,proj1.java");
        check(m5,5);

        Pattern p6=Pattern.compile("\\d{3}(\\p{Punct}| )?\\d{4}");
        Matcher m6=p6.matcher("123 4567");
        check(m6,6);
    }
    public static   void check(Matcher m, int num){
        System.out.println("__Matcher №"+num);
        while (m.find()){
            System.out.print("["+m.start()+"  "+m.group()+"]   ");
        }
        System.out.println("\n");
    }


}
