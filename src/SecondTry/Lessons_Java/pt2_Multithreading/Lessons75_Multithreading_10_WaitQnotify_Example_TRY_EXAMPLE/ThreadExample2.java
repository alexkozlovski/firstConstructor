package SecondTry.Lessons_Java.pt2_Multithreading.Lessons75_Multithreading_10_WaitQnotify_Example_TRY_EXAMPLE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThreadExample2 {
    static List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        new Operator().start();
        new Machine().start();

    }

    static class Operator extends Thread {
        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            while (true) {
                synchronized (strings) {
                    strings.add(sc.nextLine());
                    strings.notify();
                }
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Machine extends Thread {
        @Override
        public void run() {
            while (strings.isEmpty()) {
                synchronized (strings) {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(strings.remove(0));
            }
        }
    }
}
