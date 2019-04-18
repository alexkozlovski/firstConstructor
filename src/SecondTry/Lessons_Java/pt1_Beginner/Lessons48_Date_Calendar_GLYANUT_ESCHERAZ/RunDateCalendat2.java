package SecondTry.Lessons_Java.pt1_Beginner.Lessons48_Date_Calendar_GLYANUT_ESCHERAZ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class RunDateCalendat2 {
    public static void main(String[] args) throws ParseException {
        String stringDate1="15/08/2018";
        String stringDate2="30/08/2018";

        SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");

/*        Date date1= new Date();
        Date date2=new Date();
        date1=f.parse(stringDate1);
        date2=f.parse(stringDate2);*/
        Date date1=f.parse(stringDate1);
        Date date2=f.parse(stringDate2);
        System.out.println(f.format(date1)+"  "+f.format(date2));
        Calendar day1=Calendar.getInstance();
        Calendar day2=Calendar.getInstance();
        day1.setTime(date1);
        day2.setTime(date2);
        System.out.println(day2.get(Calendar.DAY_OF_YEAR)-day1.get(Calendar.DAY_OF_YEAR));


        //int daysBetween=
    }
}
