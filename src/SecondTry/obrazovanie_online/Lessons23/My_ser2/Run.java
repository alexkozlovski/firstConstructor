package SecondTry.obrazovanie_online.Lessons23.My_ser2;

import java.io.*;

public class Run {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cat max=new Cat("maxik","blackwhite",4,3);
        ObjectOutputStream  objectOutputStream=new ObjectOutputStream(new FileOutputStream(new File("Myser_2.txt")));
        objectOutputStream.writeObject(max);
        objectOutputStream.flush();
        objectOutputStream.close();

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(new File("Myser_2.txt")));

        Cat testCat=(Cat)objectInputStream.readObject();

        testCat.getInfo();

    }
}
