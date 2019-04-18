package SecondTry.Lessons_Java.pt1_Beginner.Lessons19_Constructors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringExample {
    public static void main(String[] args) throws ParseException {
        String str1="Cat";
        String str2="Cat";
        String str3=new String("Cat");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

        String stringa="My name is Alex and i haven't girlfriend at this moment, lol kek";

        String str = "Jul 26, 2015";
        Date date = new SimpleDateFormat("MMMM d, yy", Locale.ENGLISH).parse(str);
        System.out.println(date);

        System.out.println("=======================================");
        int str1byte=0;
        int str2byte=0;
        String myString="meoew meow";
        byte[] myByteArray=myString.getBytes();
        for (int i:
                myByteArray) {
            System.out.print(i+"    ");
            str1byte+=i;
        }
        System.out.println();
        String myString2="meoew mdeow";
        byte[] myByteArray2=myString2.getBytes();
        for (int i:
                myByteArray2) {
            System.out.print(i+"    ");
            str2byte+=i;
        }
        System.out.println();
        System.out.println(str1byte==str2byte);
        char ch='m';
        int a=ch;
        System.out.println(a);
    }
}
