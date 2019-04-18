package SecondTry.Lessons_Java.pt3_JDBC.Lessons_191_JDBC_9_DATE_AND_sequence;

import java.util.Date;

public class Main2 {
    public static void main(String[] args) {
        Date date=new Date();
       long i= date.getTime();
        System.out.println(i);
    }
}
