package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 14.10.2018.
 */
public class po {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("\\p{Alpha}*","");
        s=s.replaceAll("\\p{Punct}+"," ");
        System.out.println(s);
        Pattern pattern=Pattern.compile("[1-3]");
        Matcher matcher=pattern.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
