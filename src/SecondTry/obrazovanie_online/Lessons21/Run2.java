package SecondTry.obrazovanie_online.Lessons21;
import java.io.FileReader;

public class Run2 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("filefile.txt");
        char[] c=new char[256];
        fr.read(c);
/*        FileWriter fw=new FileWriter("filefile.txt");
        c[20]='a';
        fw.write(c);
        fw.flush();
        fw.close();*/
/*        for (char ar: c) {
            System.out.print(ar);
        }*/
    }
}
