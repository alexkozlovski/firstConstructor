package SecondTry.Lessons_Java.pt6_WEB.Lessons_180_HTTP_how_to_get_HTML;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by user on 23.09.2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        URLConnection connection=new URL("http://www.google.kz").openConnection();
        Scanner scanner=new Scanner(connection.getInputStream());
       //scanner.useDelimiter("\\Z");
        String s="";
        while (scanner.hasNextLine()){
            //System.out.println(scanner.nextLine());
            s+=scanner.nextLine();
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("google.html"));
        bw.write(s);
        bw.flush();
        bw.close();
        System.out.println("____________________");
        Map<String,List<String >> headerFields=connection.getHeaderFields();
        for (Map.Entry<String,List<String>>entry:headerFields.entrySet()){
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }

    }
}
