package SecondTry.obrazovanie_online.Lessons21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Run5 {
    public static void main(String[] args) throws Exception{
        File file=new File("les21Run5");
/*            FileWriter fw=new FileWriter(file);
            fw.append('1');
            fw.flush();
            CharSequence cs="\n 1 2 3 4 5 6 \n";
            fw.append(cs);
            fw.flush();
            fw.close();*/
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line;
/*        while((line=br.readLine())!=null){
            System.out.println(line);
        }*/
        int[] n;
        while((line=br.readLine())!=null){
            String[]str=line.split(" ");
            n=new int[str.length];
            for (int i = 0; i <str.length ; i++) {
                n[i]=Integer.valueOf(str[i]);
                System.out.print("NM  -   "+n[i]);
            }
            System.out.println();
        }
        fr.close();
        br.close();




    }
}
