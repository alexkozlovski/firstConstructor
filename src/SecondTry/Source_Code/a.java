package SecondTry.Source_Code;

import java.io.File;
import java.io.IOException;

public class a {
    public static void main(String[] args) throws InterruptedException {
/*        System.out.println(Integer.toBinaryString(128));
        System.out.println(Integer.toOctalString(191));
        byte b=(byte)-128;
        System.out.println(b);
        System.out.println(Integer.toBinaryString(-b));
        System.out.println(Integer.toHexString(191));
        System.out.println(Integer.parseInt("b",16));
        System.out.println(Integer.parseInt("1111001",2));*/

 /*       File file=new File("map.txt");

            try {
                if(!file.exists())file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Thread.sleep(5000);
            file.renameTo(new File("zhopa.txt"));*/
        System.out.println(Integer.toHexString(Integer.parseInt("16E",16)*Integer.parseInt("e",16)));
char[] chars={'1','2','g'};
        System.out.println(String.valueOf(chars,1,chars.length-1));

    }

}
