package SecondTry.Source_Code.Regex.Lessons7_Possesive_quantificators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        int counter=0;
        Pattern p1=Pattern.compile(".*+19");
        Matcher m1=p1.matcher("192.168.1.197");
        while (m1.find()) System.out.println("match №"+(++counter)+" found '"+
                m1.group()+" start at"+m1.start()+" end at "+m1.end());

    }
}
