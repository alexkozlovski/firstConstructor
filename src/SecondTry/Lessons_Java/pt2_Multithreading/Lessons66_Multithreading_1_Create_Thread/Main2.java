package SecondTry.Lessons_Java.pt2_Multithreading.Lessons66_Multithreading_1_Create_Thread;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Mythread2 mythread=new Mythread2();
       // new Mythread2().start();
        mythread.start();
       // new Mythread2().start();
        Mythread2 mythread2=new Mythread2();
        Mythread2 mythread3=new Mythread2();
        Mythread2 mythread4=new Mythread2();
        mythread2.start();
        mythread3.start();
        mythread4.start();
        mythread.join();
        mythread2.join();
        mythread3.join();
        mythread4.join();
        mythread4.join();
    }
}
class Mythread2 extends Thread {
    @Override
    public void run()  {
       for (int i = 0; i <400 ; i++) {
            System.out.println("this name is "+Thread.currentThread().getName()+" i="+i);
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }
}