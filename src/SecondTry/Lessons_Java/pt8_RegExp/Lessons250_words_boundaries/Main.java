package SecondTry.Lessons_Java.pt8_RegExp.Lessons250_words_boundaries;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 30.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        //\b \bword\b \B \w \W
        //\b\w+\b
        Pattern p1=Pattern.compile("\\bis\\b");
        Matcher m1=p1.matcher("this island is beautiful");
        main.print(m1,1);
    }
    void print(Matcher m,int number){
        System.out.println("Matcher\\Pattern    "+number);
        while(m.find()) System.out.print("at "+m.start()+" pos - "+m.group());
        System.out.println("\n______________________________");
    }
}
