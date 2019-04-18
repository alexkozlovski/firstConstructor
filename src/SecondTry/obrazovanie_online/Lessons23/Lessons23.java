package SecondTry.obrazovanie_online.Lessons23;

import java.io.*;

public class Lessons23 {
    public static void main(String[] args) throws Exception{

        FileOutputStream fos=new FileOutputStream("Lessos23Test.txt");
        ObjectOutputStream obsOs=new ObjectOutputStream(fos);
        Test test=new Test();
        test.setA(111);
        obsOs.writeObject(test);
        obsOs.flush();
        obsOs.close();


        ObjectInputStream objinS= new ObjectInputStream(new FileInputStream("Lessos23Test.txt"));
        Test testobj=(Test)objinS.readObject();
        System.out.println(testobj.getA());
        objinS.close();
    }
}
