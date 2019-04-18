package SecondTry.Lessons_Java.pt4_Advanced.Lessons150_Debugging;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by user on 18.09.2018.
 */
public class Main2_proxy {
    private final static Logger log=Logger.getGlobal();
    public static void main(String[] args) {

        Random random=new Random(){
            @Override
            public double nextDouble() {
                Double d=super.nextDouble();
                System.out.println(d);
                return d;
            }
        };
        random.nextDouble();

    }
}
