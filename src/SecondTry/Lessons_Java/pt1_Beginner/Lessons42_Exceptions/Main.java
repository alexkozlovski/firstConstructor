package SecondTry.Lessons_Java.pt1_Beginner.Lessons42_Exceptions;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Main().someMethode();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.toString());
        }


    }

    void someMethode() throws IOException {
        File file=new File("");
        file.createNewFile();

        throw new IOException();


    }
}