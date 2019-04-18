package SecondTry.Lessons_Java.pt4_Advanced.Lessons150_Debugging.simple_Example_with_CarMAin;

import java.util.logging.Logger;

/**
 * Created by user on 18.09.2018.
 */
public class Main {
    private static final Logger log=Logger.getGlobal();
    public static void main(String[] args) {
        int i=2;
        System.out.println(i);
        System.out.println();
        Car car=new Car();
        System.out.println(car.run(200,23));
    }
}


