package SecondTry.obrazovanie_online.Lessons21;

import java.io.*;

public class Run5_1 {
    public static void main(String[] args) throws IOException {
        File file=new File("les21Run5_1.txt");
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line="";
        int[] n=null;
        while((line=br.readLine())!=null){
            String[] str=line.split(" ");
            n=new int[str.length];
            for (int i = 0; i <str.length ; i++) {
                n[i]=Integer.valueOf(str[i]);
                System.out.print("NM  -   "+n[i]);
            }
            System.out.println();
        }



    }
}
