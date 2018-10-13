package SecondTry.Source_Code.Regex.Lessons5_Lazy_quantificators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        int counter=0;

        String str="196.198.1.197";
        Pattern p1=Pattern.compile(".*?19");
        Matcher m1=p1.matcher(str);

        while (m1.find()){
            counter++;
            System.out.println("Match №"+counter+" found '"+
            str.substring(m1.start(),m1.end())+
            "', Starting at index: "+m1.start()+
            "and ending at index: "+m1.end()+
            " .... group ["+m1.group()+"]");
        }
    }

}
