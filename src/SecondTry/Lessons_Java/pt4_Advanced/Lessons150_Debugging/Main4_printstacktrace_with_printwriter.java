package SecondTry.Lessons_Java.pt4_Advanced.Lessons150_Debugging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * Created by user on 18.09.2018.
 */
public class Main4_printstacktrace_with_printwriter {
    private static final Logger log= Logger.getGlobal();
    public static void main(String[] args)throws Exception {
        method();
    }
    private static void method() throws FileNotFoundException {
        PrintWriter pw=new PrintWriter(new File("ingest.log"));
        new Throwable().printStackTrace(pw);
        pw.flush(); pw.close();
    }
}
