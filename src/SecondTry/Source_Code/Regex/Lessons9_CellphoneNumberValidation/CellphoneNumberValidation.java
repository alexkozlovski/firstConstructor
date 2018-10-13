package SecondTry.Source_Code.Regex.Lessons9_CellphoneNumberValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class CellphoneNumberValidation {
    public static void main(String[] args) {
        String phoneNumber="+375259067991";
        String phoneNumber1="375259067991";
        Pattern pattern=Pattern.compile("^((\\+?375)([0-9]{9}))$");//две группы первая для кода страны, вторая для
        // номера. объединияем в одну с циркумфлексом в начала и знаком доллара в кнце
        // \+? - экранируем +. и значит что он может быть, а может не быть
        //можно вместо [0-9] \\d \\p{Digit}
        System.out.println(pattern.matcher(phoneNumber).find());
        System.out.println(pattern.matcher(phoneNumber1).find());
    }
}
