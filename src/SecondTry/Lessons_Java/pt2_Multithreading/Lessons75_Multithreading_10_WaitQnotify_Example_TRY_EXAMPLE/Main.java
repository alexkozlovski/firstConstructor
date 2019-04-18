package SecondTry.Lessons_Java.pt2_Multithreading.Lessons75_Multithreading_10_WaitQnotify_Example_TRY_EXAMPLE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
   static List strings= Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        new ReadRead().start();
        new WriteWrite().start();
    }
    static class ReadRead extends Thread{
        @Override
        public void run() {
            while(strings.isEmpty()){
                synchronized (strings){
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    static class WriteWrite extends Thread{
        @Override
        public void run() {
            Scanner sc=new Scanner(System.in);
            while (true){
                synchronized (strings){
                    strings.add(sc.nextLine());
                    strings.notify();
                }
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(strings.remove(0));
            }

        }
    }
}
