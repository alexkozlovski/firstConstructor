package SecondTry.Lessons_Java.pt8_RegExp.Lessons252_Pipeline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 30.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        Main main=new Main();

        Pattern p1=Pattern.compile("cat|dog");
        Matcher m1=p1.matcher("i like my dog!");
        main.print(m1,1);


        Pattern p2=Pattern.compile("Get|getValue|Set|SetValue");
        Matcher m2=p2.matcher("SetValue");
        main.print(m2,2);
    }
    void print(Matcher m,int number){
        System.out.println("Matcher\\Pattern    "+number);
        while(m.find()) System.out.print(" at "+m.start()+" pos - "+m.group());
        System.out.println("\n______________________________");
    }
}
