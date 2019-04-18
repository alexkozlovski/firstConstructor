package SecondTry.Lessons_Java.pt8_RegExp.Lessons253_Optional_Itms_question_mark;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 30.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        Pattern p1=Pattern.compile("colou?r");
        Matcher m1=p1.matcher("Color colour");
       main.print(m1,1);

       Pattern p2=Pattern.compile("Nov(ember)?");//если два знака вопрос, то он будет lazy короче выведет Nov Nov
       Matcher m2=p2.matcher("November Nov");
       print(m2,2);

       Pattern p3=Pattern.compile("Feb(ruary)? 23(rd)?");
       Matcher m3=p3.matcher("February 23rd, February 23, Feb 23rd, Feb 23");
        print(m3,3);



    }
/*    void print(Matcher m,int number){
        System.out.println("Matcher\\Pattern    "+number);
        while(m.find()) System.out.print(" at "+m.start()+" pos - "+m.group());
        System.out.println("\n______________________________");
    }*/
     static  void print(Matcher m,int number){
        System.out.println("Matcher\\Pattern    "+number);
        while(m.find()) System.out.print(" at "+m.start()+" pos - "+m.group()+"; ");
        System.out.println("\n______________________________");
    }
}
