package SecondTry.Lessons_Java.pt1_Beginner.Lessons64.Test.com.app.main;

import SecondTry.Lessons_Java.pt1_Beginner.Lessons64.Test.com.app.car.Car;
import SecondTry.Lessons_Java.pt1_Beginner.Lessons64.Test.com.app.mazda.Mazda;

/**
 * Created by user on 13.09.2018.
 */
public class Run {
    public static void main(String[] args) {
            Mazda RX8=new Mazda("RX8",220);
            Car Rx7=new Mazda("rx7",270);
        System.out.println(Rx7.getModel());
            String str=new String(RX8.getInfo());
        System.out.println(str);
        Rx7.drive();
        RX8.drive();
    }
}
