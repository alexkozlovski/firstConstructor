package SecondTry.Lessons_Java.pt2_Multithreading.Lessons75_Multithreading_10_WaitQnotify_Example_TRY_EXAMPLE;

import java.io.*;

public class Run {
    public static void main(String[] args) {




    }
    static class LittleWriter extends Thread{
        @Override
        public void run() {
            File stringss=new File("MultithreadStrings.txt");
            FileWriter fr;
            BufferedWriter bw;
            try {
                if (!stringss.exists()) {
                    try {
                        stringss.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                fr=new FileWriter(stringss);
                bw=new BufferedWriter(fr);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    static class LittleReader extends Thread{
        @Override
        public void run() {
            File stringss=new File("MultithreadStrings.txt");
            FileReader fr;
            BufferedReader br;
            try {
                if (!stringss.exists()) {
                    try {
                        stringss.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                fr=new FileReader(stringss);
                br=new BufferedReader(fr);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
