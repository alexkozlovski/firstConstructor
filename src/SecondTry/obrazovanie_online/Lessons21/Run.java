package SecondTry.obrazovanie_online.Lessons21;

import java.io.*;

public class Run {
    public static void main(String[] args) throws IOException {
        File file=new File("les21test.txt");
        FileWriter fileWriter=new FileWriter(file);
        CharSequence cs="Hello World";
        fileWriter.append(cs);
        fileWriter.flush();
        fileWriter.close();
        FileReader fileReader=new FileReader("les21test.txt");
        BufferedReader br=new BufferedReader(fileReader);
        String line="";
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        fileReader.close();
        br.close();

    }

}
