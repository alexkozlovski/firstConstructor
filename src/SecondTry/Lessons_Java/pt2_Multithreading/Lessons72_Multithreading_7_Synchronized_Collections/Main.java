package SecondTry.Lessons_Java.pt2_Multithreading.Lessons72_Multithreading_7_Synchronized_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NameList nameList = new NameList();
        nameList.add("test1");
        class Mythread extends Thread {
            @Override
            public void run() {
                System.out.println(nameList.removeFirst());
            }
        }
        Mythread mythread = new Mythread();
        mythread.setName("One");
        mythread.start();
        new Mythread().start();

    }

    static class NameList {
        private List list = Collections.synchronizedList(new ArrayList<>());

        public void add(String name) {
            list.add(name);
        }

        public synchronized String removeFirst() {
            if (list.size() > 0) {
                if (Thread.currentThread().getName().equals("One")) {
                    Thread.yield();
                }
                return (String) list.remove(0);
            }
            return null;
        }
    }
}
