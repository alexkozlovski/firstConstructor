package SecondTry.Lessons_Java.pt1_Beginner.Lessons34_Garbage_Collector;

import java.util.Date;

public class Run {
    public static void main(String[] args) {
        methode();
        String str;
    }
    public static void methode(){
        Date date=new Date();
        System.out.println(date);
    }
    public static String getDate(){
        Date date=new Date();
        return date.toLocaleString();
    }
}
