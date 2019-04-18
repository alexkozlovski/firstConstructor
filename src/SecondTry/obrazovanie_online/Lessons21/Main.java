package SecondTry.obrazovanie_online.Lessons21;

import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        File file=new File("les221asd.txt");
/*        FileWriter fw=new FileWriter(file);
        CharSequence cs="Hello world!";
        fw.append(cs);
        fw.flush();
        fw.close();*/
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line;
        int[]n=null;
        while((line=br.readLine())!=null){

            String[] str=line.split(" ");
            n=new int[str.length];
            for (int i = 0; i <str.length ; i++) {
                n[i]=Integer.valueOf(str[i]);
                System.out.print("Nm  -   "+n[i]);
            }
            System.out.println();
        }
        fr.close();
        br.close();



    }
}
