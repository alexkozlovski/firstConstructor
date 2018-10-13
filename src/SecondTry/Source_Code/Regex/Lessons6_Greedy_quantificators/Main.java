package SecondTry.Source_Code.Regex.Lessons6_Greedy_quantificators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        int countr=0;
        String str="196.198.1.197";
        Pattern p1=Pattern.compile(".*19");
        Matcher m1= p1.matcher(str);
        while (m1.find()) System.out.println(m1.start()+"   "+m1.group());
        System.out.println("196.198.1.197".contains("698."));
    }
}
