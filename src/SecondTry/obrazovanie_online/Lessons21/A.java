package SecondTry.obrazovanie_online.Lessons21;

import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        OutputStream os=new FileOutputStream(new File("les221asd.txt"));
        os.write('5');
        os.flush();
        os.close();
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        InputStream inps=new FileInputStream(new File("les221asd.txt"));
        int t=inps.read();
        inps.close();
        System.out.println("t = "+t);
    }
}
