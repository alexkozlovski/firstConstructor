package SecondTry.Lessons_Java.pt8_RegExp.Lessons246_what_is_RegExp;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 28.09.2018.
 */
public class Main2 {
    public static void main(String[] args) {
         System.out.println("myemail@mail.ru".matches("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b"));
        Pattern p=Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b");
        Matcher m=p.matcher("suka glo glo sax@email.ru");
        while (m.find()) System.out.println(m.start()+" "+m.group());
    }
}
