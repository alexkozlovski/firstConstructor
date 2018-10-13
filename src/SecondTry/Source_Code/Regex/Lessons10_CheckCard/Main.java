package SecondTry.Source_Code.Regex.Lessons10_CheckCard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 09.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        //номер карты состоит из 16 цифр
        //срок действия - месяц черта и год(номер месяца от 1 до 12. две последние цифыры могут быть до 99 между ними должна быть черта);
        //cvv до 3 цифр от 0 до 9
        String cardNumber="2234 5678 90123456";
        String cardDate="03/12";
        String cardCVV="123";
        Pattern cardNumbPat=Pattern.compile("([2-6]([\\d]{3}) ?)(([\\d]{4} ?){3})");
        //номер карты может начинаться от цифры от 2 до 6 далее содержится группа цифр от 0 до 9 которая повторяется 3 раза
        //в конце группы может содержаться пробел, но это не обязательно
        //далее 3 группы по 4 символа от 0 до 9 которые или разделяются или не разделяются пробелом

        Pattern cardDatePat=Pattern.compile("(0[1-9]|1[0-2])/([0-9]{2})");
        // в первой группе определяем месяц, он может быть от 1 до 9 или от 10 до 12
        //во второй группы определяется год может быть от 1 до 9 группы разделяются чертой

        Pattern CVVPat=Pattern.compile("[0-9]{3}");
        //...


        Matcher cardNumMath=cardNumbPat.matcher(cardNumber);
        Matcher cardDateMatch=cardDatePat.matcher(cardDate);
        Matcher cardCVVMatch=CVVPat.matcher(cardCVV);


        if(cardNumMath.find()&&cardDateMatch.find()&&cardCVVMatch.find()){
            System.out.println("card info is correct");
        }else{
            System.out.println("incorrect card info!");
        }






    }
}
