package SecondTry.Lessons_Java.pt2_Multithreading.Lessons66_Multithreading_1_Create_Thread;

public class Main {
    public static void main(String[] args) throws Exception{
        int i=0;
        Mythread mythread=new Mythread();
        Mythread mythread2=new Mythread();
        MyRunnable myRunnable=new MyRunnable();
        MyRunnable myRunnable1=new MyRunnable();
        Thread thread=new Thread(myRunnable);
        Thread thread2=new Thread(myRunnable);
        mythread.setName("MYTHREAD !!11!!");
        mythread2.setName("MYTHREAD !!22!!");
        mythread2.setName("THREAD !!11!!");
        mythread2.setName("THREAD !!22!!");
            mythread.start();
            mythread2.start();
        thread.start();
        thread2.start();
/*        myRunnable.run();
        myRunnable1.run();*/




    }

}
class Mythread  extends Thread  {
    int i=0;

    @Override
   public void run() {
        //synchronized (this){
        System.out.println("this is thread"+this.getName());

        for (int j = 0; j <10 ; j++) {
           // Thread.currentThread().setName("Lol kek thread  ="+i);
            System.out.println(i+++"    Name Thread is \""+Thread.currentThread().getName()+"\"   priority= "+Thread.currentThread().getPriority()+"    state ");
            try {
                Thread.sleep(900);
            }catch (InterruptedException e){
                e.printStackTrace();
            }


        }
        }

   // }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        //synchronized (this){
        System.out.println("this is Runnable  thread"+Thread.currentThread().getName());

        for (int j = 0; j <10 ; j++) {
           // Thread.currentThread().setName("Lol kek Runnablethread  ="+j);
            System.out.println(j+++"    Name  Thread is \""+Thread.currentThread().getName()+"\"   priority= "+Thread.currentThread().getPriority()+"    state ");
            try {
                Thread.sleep(900);
            }catch (InterruptedException e){
                e.printStackTrace();
            }


        }
    }
}