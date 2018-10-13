package SecondTry.Source_Code.Regex.Lessons14_CheckEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        //email consist of username @ namemail.domen
        String email="alexkozlovski@mail.ru";
        Pattern pattern=Pattern.compile("^((\\w|[-+])*(\\.[\\w-]*)*@[\\w-]*((\\.[\\d\\p{Alpha}]+)*(\\.\\p{Alpha}{2,})*)*)$");
        Matcher matcher=pattern.matcher(email);
        if (matcher.find()) System.out.println("yes");
        System.out.println("myemail@mail.ru".matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"));
        //System.out.println("myemail@mail.ru".matches("/.+@.+\\..+/i"));
    }
}
