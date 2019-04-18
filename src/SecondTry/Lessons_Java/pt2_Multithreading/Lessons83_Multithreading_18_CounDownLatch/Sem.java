package SecondTry.Lessons_Java.pt2_Multithreading.Lessons83_Multithreading_18_CounDownLatch;

import java.util.concurrent.CountDownLatch;

public class Sem {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch=new CountDownLatch(3);
       // countDownLatch.await();
        new Work(countDownLatch).run();
        new Work(countDownLatch).run();
        new Work(countDownLatch).run();
       countDownLatch.await();
        System.out.println("all jobs is done");
    }
}
class Work extends Thread{
    public Work(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    CountDownLatch countDownLatch;

    public void run(){
        try {
            sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work is done");
        countDownLatch.countDown();
    }
}