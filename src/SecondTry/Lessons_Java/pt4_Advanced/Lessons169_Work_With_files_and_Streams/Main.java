package SecondTry.Lessons_Java.pt4_Advanced.Lessons169_Work_With_files_and_Streams;

import java.awt.*;
import java.io.*;
import java.net.URISyntaxException;

/**
 * Created by user on 22.09.2018.
 */
public class Main {
    public static void main(String[] args) throws IOException,URISyntaxException,AWTException{
        /*Reader reader;
        Writer writer;
        InputStream is;
        OutputStream os;*/
        Reader reader=new FileReader("temp.txt");
        char[] a=new char[255];
        reader.read(a);
/*        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }reader.close();*/
        BufferedReader br=new BufferedReader(new FileReader("temp.txt"));
/*        String str;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }*/
        System.out.println(br.readLine()+"1");
        System.out.println(br.readLine()+"2");


    }
}
