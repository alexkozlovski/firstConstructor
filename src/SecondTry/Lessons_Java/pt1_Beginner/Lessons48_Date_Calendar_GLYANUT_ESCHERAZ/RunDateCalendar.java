package SecondTry.Lessons_Java.pt1_Beginner.Lessons48_Date_Calendar_GLYANUT_ESCHERAZ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class RunDateCalendar {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        Calendar calendar=Calendar.getInstance(new Locale("ru"));
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm//dd//MM//yy.");
        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("dd//MM//yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));


        Date date1=simpleDateFormat1.parse("14//12//1995");
        Date date2=calendar.getTime();
        System.out.println(date1);
        System.out.println(simpleDateFormat1.format(date1)+" "+simpleDateFormat1.format(date2));

        //int daysBetween=calendar.setTime(date1);

    }
}
