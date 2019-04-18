package SecondTry.Lessons_Java.pt2_Multithreading.Lessons87_Multithreading_22_BlockingQueue;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        BlockingQueue<String> queue=new PriorityBlockingQueue<>();

        new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                queue.add("this is string");
            }
        }.start();
    }
}
