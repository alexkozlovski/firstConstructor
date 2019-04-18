package SecondTry.Lessons_Java.pt8_RegExp.Lessons249_dot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 28.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        Pattern p=Pattern.compile("\\d\\d.\\d\\d.\\d\\d");
        Matcher m=p.matcher("14/12/95");
        main.print(m,0);

        Pattern p1=Pattern.compile("\\d\\d[-/ .]\\d\\d[- /.]\\d\\d");
        Matcher m1=p1.matcher("12-12-12");
        main.print(m1,1);

        Pattern p2=Pattern.compile("\".*?\"");//reluctant(lazy)  without ? after *(*?) it will be greedy operator
        Matcher m2=p2.matcher("put a \"string\" between double quotes");
        Matcher m21=p2.matcher("Houston, we have a problem with \"string one\" and \"string two\" Please respond.");
        main.print(m2,2); main.print(m21,21);


        Pattern p3=Pattern.compile("\"[^\"\r\n]*\"");
        Matcher m3=p3.matcher("Houston, we have a problem with \"string one\" and \"string two\" Please respond.");
        main.print(m3,3);

    }
    void print(Matcher m,int number){
        System.out.println("Matcher\\Pattern    "+number);
        while(m.find()) System.out.print("at "+m.start()+" pos - "+m.group());
        System.out.println("\n______________________________");
    }

}
