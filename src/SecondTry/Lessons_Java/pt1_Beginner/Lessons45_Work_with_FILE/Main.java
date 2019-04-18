package SecondTry.Lessons_Java.pt1_Beginner.Lessons45_Work_with_FILE;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File file=new File("MyTemptxtLess45.txt");
        if(!file.exists()) file.createNewFile();
        FileWriter fw=new FileWriter(file);
/*        fw.write("asd\na\nasdasd");
        fw.flush();
        fw.close();*/
        char[] ch=new char[250];
      FileReader fr=new FileReader(file);
       /*   fr.read(ch);
        String str=new String(ch);
        System.out.println(str.replace('\n',' '));*/
        BufferedWriter bufferedWriter=new BufferedWriter(fw);
        bufferedWriter.write("asdasd");
        bufferedWriter.newLine();
        bufferedWriter.write("asdasd");
        bufferedWriter.flush();
        bufferedWriter.close();
        BufferedReader br=new BufferedReader(fr);
        for (;br.ready() ;) {
            System.out.println(br.readLine());
        }


    }
}
