package SecondTry.Lessons_Java.pt2_Multithreading.Lessons67_Multithreading_2_Threads_Life_cycle;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Mythread mythread=new Mythread();
      //  Thread.currentThread().join();
        mythread.start();
         Thread.yield();
        // mythread./**/join();
        System.out.println("eeee thread");

    }
}
class Mythread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"   "+i);
        }
    }
}