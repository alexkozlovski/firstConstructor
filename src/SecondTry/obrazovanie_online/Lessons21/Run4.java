package SecondTry.obrazovanie_online.Lessons21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Run4 {
    public static void main(String[] args)throws Exception {
        File file=new File("les21Run4");
        FileWriter fw=new FileWriter(file);
        char[] ch={'h','e','l','l','o',' ','w','o','r','l','d','\n','h','e','l','l','o',' ','w','o','r','l','d'};
        for (int i = 0; i <ch.length ; i++) {
            fw.append(ch[i]);
        }
        fw.flush();
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String str;
        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        CharSequence cs="epolo\nlol";
        while((br.readLine())==null){
            fw.append(cs);
            fw.flush();
        }
        System.out.println("____________________________");
        while((str=br.readLine())!=null){
            System.out.println(str);
        }

    }
}
