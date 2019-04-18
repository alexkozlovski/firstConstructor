package SecondTry.Lessons_Java.pt4_Advanced.Lessons150_Debugging;

import java.util.logging.Logger;

/**
 * Created by user on 18.09.2018.
 */
public class Main3_dumpStack {
    private static final Logger log= Logger.getGlobal();
    public static void main(String[] args) throws Exception{
        method();
    }
    private static void method(){
        Thread.dumpStack();
/*        try2 {
            throw new Exception("message");
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }
}
