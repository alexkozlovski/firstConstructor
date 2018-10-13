package SecondTry.Lessons_Java.pt8_RegExp.LEssons264_Posix;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        //[:digit:]
        //[x-z[:digit:]]
        Pattern p=Pattern.compile("^x-z\\p{Digit}");
        Matcher m1=p.matcher("S5");
        main.check(m1,1);

    }
    public   void check(Matcher m, int num){
        System.out.println("__Matcher №"+num);
        while (m.find()){
            System.out.println(m.start()+"  "+m);
        }
        System.out.println("\n");
    }

}
