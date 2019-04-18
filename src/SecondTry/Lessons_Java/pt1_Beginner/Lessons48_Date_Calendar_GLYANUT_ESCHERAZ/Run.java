package SecondTry.Lessons_Java.pt1_Beginner.Lessons48_Date_Calendar_GLYANUT_ESCHERAZ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE,2);
        //calendar.set(2011,33,22,23,13);
        System.out.println(calendar.getTime());

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy год HH:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        //System.out.println(new SimpleDateFormat("HH:mm, dd//MM/yy.").format(Calendar.getInstance().getTime()));
        Date newDate=simpleDateFormat.parse("20/02/2015 год 03:12.");
        System.out.println(newDate);
    }
}
