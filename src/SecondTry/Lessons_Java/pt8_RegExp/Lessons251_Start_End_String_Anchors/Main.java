package SecondTry.Lessons_Java.pt8_RegExp.Lessons251_Start_End_String_Anchors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 30.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
       // Pattern p1=Pattern.compile("^a");
      //  Pattern p1=Pattern.compile("^b");
        Pattern p1=Pattern.compile("c$");
//        Pattern p1=Pattern.compile("b$");
        Matcher m1=p1.matcher("abc");
        main.print(m1,1);

//        Pattern p2=Pattern.compile("\\d+");
        Pattern p2=Pattern.compile("^\\d+$");
        Matcher m2=p2.matcher("123");
        main.print(m2,2);

//        Pattern p3=Pattern.compile("ne$",Pattern.MULTILINE);
        Pattern p3=Pattern.compile("ne\\Z", Pattern.MULTILINE);
//        Pattern p3=Pattern.compile("ne\\z",Pattern.MULTILINE);
        Matcher m3=p3.matcher("test1 line\n"+"second line");
        main.print(m3,3);
    }
    void print(Matcher m,int number){
        System.out.println("Matcher\\Pattern    "+number);
        while(m.find()) System.out.print(" at "+m.start()+" pos - "+m.group());
        System.out.println("\n______________________________");
}
}
