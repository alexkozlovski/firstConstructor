package SecondTry.Lessons_Java.pt4_Advanced.Lessons150_Debugging;

import java.util.logging.Logger;

/**
 * Created by user on 18.09.2018.
 */
public class Main6_uncaughtExceptionHandler {
    private static final Logger log=Logger.getGlobal();

    public static void main(String[] args) {
        method();
    }
    private static void method(){
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {

            }
        });


    }
}
