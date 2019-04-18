package SecondTry.Lessons_Java.pt4_Advanced.Lessons169_Work_With_files_and_Streams;

import java.io.*;

/**
 * Created by user on 22.09.2018.
 */
public class Streams {
    public static void main(String[] args) throws IOException {
        InputStream is=new FileInputStream(new File("temp.txt"));
        int i=0;
        while ((i=is.read())!=-1) System.out.println(i);
    }
}
