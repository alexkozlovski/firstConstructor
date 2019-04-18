package SecondTry.Lessons_Java.pt1_Beginner.Lessons48_Date_Calendar_GLYANUT_ESCHERAZ;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
public class DateWith_8640000_ {
    public static void main(String[] args) {


        Calendar cal1=new GregorianCalendar();
        Calendar cal2=new GregorianCalendar();


        cal1.set(1995,12,14);
        cal2.set(2018,8,30);

/*        // System.out.println(cal1.get(Calendar.FIELD_COUNT));
        System.out.println( );*/

        //double i=Math.rint(getDaysBetween(cal1.getTime(),cal2.getTime())/31/12);
        System.out.println(getDaysBetween(cal1.getTime(),cal2.getTime()));
    }
    public static int getDaysBetween(Date d1,Date d2){
        return Math.round((d2.getTime()-d1.getTime())/(1000*60*60*24));

    }
}
