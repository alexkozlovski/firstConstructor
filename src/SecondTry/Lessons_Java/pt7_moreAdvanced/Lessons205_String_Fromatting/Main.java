package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons205_String_Fromatting;


import java.text.MessageFormat;
import java.util.GregorianCalendar;
public class Main {
    public static void main(String[] args) {
        //Locale locale=new Locale("en");

        String s3="On {1,date,full} was {0},{2,choice,0#no houses|1#one house|2#{2} houses} was destroyed";
        String s4=MessageFormat.format(s3,"huracane",new GregorianCalendar(2016,2,22).getTime(),10);
        System.out.println(s4);
        //number integer,currency,percent
        //time,date short,medium,lon,full
        //
    }
}
