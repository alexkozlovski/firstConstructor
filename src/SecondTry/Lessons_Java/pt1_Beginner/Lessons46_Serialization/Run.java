package SecondTry.Lessons_Java.pt1_Beginner.Lessons46_Serialization;

import java.io.*;

public class Run {
    public static void main(String[] args) throws  Exception {
        CatChild cat=new CatChild("maxik",4,20);
        System.out.println(cat.toString());

        try {
            FileOutputStream FS=new FileOutputStream(new File("Lesson46catSer.txt"));
            ObjectOutputStream OS=new ObjectOutputStream(FS);
            OS.writeObject(cat);
            OS.flush();
            OS.close();
            FS.flush();FS.close();
        }catch (IOException e){
            e.printStackTrace();
        }

          //  FileInputStream FIS= new FileInputStream(new File("Lesson46catSer.txt"));
        ObjectInputStream OIS=new ObjectInputStream(new FileInputStream(new File("Lesson46catSer.txt")));
        CatChild testCat= (CatChild) OIS.readObject();
        //System.out.println(testCat.toString());





    }
}
