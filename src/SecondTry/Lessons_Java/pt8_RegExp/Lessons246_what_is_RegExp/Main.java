package SecondTry.Lessons_Java.pt8_RegExp.Lessons246_what_is_RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 28.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("/.+@.+\\..+/i");
        Matcher m=p.matcher("asd@mail.ru");
        while (m.find()){
            System.out.println(m.start()+"  "+m.group());
        }
        System.out.println("myemail@mail.ru".matches("/.+@.+\\..+/i"));
    }
}
