package SecondTry.obrazovanie_online.Lessons23.mySer;

import java.io.*;

public class Run {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream FOS=new FileOutputStream("lessons23_My_Seriaz");
        ObjectOutputStream ObjOS= new ObjectOutputStream(FOS);
        A Vasyok=new A(23,"Вася");
        ObjOS.writeObject(Vasyok);
        ObjOS.flush();
        ObjOS.close();


        ObjectInputStream ObjInS=new ObjectInputStream(new FileInputStream("lessons23_My_Seriaz"));
        A testVasyok=(A)ObjInS.readObject();
        System.out.println(testVasyok.toString());
    }
}
