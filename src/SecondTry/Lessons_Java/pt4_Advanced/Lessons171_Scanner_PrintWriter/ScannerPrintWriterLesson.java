package SecondTry.Lessons_Java.pt4_Advanced.Lessons171_Scanner_PrintWriter;

import java.io.*;
import java.util.Scanner;

/**
 * Created by user on 22.09.2018.
 */
public class ScannerPrintWriterLesson {
    public static void main(String[] args) throws IOException {
        //Scanner sc=new Scanner(new FileReader("temp.txt"));
        //PrintWriter pw=new PrintWriter(new FileWriter("temp.txt"));
/*        Scanner sc1=new Scanner(new FileInputStream("temp.txt"));
        PrintWriter pw1=new PrintWriter(new FileOutputStream("temp.txt"));*/
        try(Scanner sc=new Scanner(new FileReader("temp.txt"))){
            while (sc.hasNext()) System.out.println(sc.next());
        }
        try(PrintWriter pw=new PrintWriter(new FileWriter("temp.txt"))){
            pw.write("opa");
            pw.append('1');
            pw.print(2);
        }
    }
}
