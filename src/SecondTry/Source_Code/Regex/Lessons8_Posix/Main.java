package SecondTry.Source_Code.Regex.Lessons8_Posix;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        int counter=0;
        String str="!@#$%^abcd1A2V3D4V5CE2!!S";
        Pattern p1=Pattern.compile("\\p{Upper}");
        Matcher m1=p1.matcher(str);
        while (m1.find()) System.out.println(++counter+" "+str.substring(m1.start(),m1.end()));
    }
}
