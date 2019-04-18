package SecondTry.obrazovanie_online.Lessons21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Run3 {
    public static void main(String[] args) throws Exception{
        File file=new File("les21.txt");
        FileWriter fw=new FileWriter(file);
        fw.write("asd\n");
        fw.append('a');
        fw.flush();
        fw.close();
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String str;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        fr.close(); br.close();





    }
}
