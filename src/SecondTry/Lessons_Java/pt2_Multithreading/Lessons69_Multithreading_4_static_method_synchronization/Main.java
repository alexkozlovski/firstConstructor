package SecondTry.Lessons_Java.pt2_Multithreading.Lessons69_Multithreading_4_static_method_synchronization;



public class Main {
    public static void main(String[] args)  throws Exception{
        Resource.i=5;
        MyThread myThread=new MyThread();
        myThread.setName("FIRST");
        MyThread myThread2=new MyThread();

        myThread.start();
        myThread2.start();
        myThread.join();
        myThread2.join();
        System.out.println(Resource.i);




    }
}


class MyThread extends Thread  {
    Resource resource;
    public void run(){
        //Resource.ChangeI();
        Resource.ChangeStaticI();
        new Resource().ChangeI();
    }
}


class Resource {


   volatile static int i;

    public int getI() {
        return i;
    }
    public synchronized void  setI(int i) {
        this.i = i;
    }


    public  static void ChangeStaticI(){
        synchronized (Resource.class){

            int i=Resource.i;
            if(Thread.currentThread().getName().equals("FIRST"))Thread.yield();
            i++;
            Resource.i=i;
        }

    }

    public void ChangeI(){
        synchronized (this){

            int i=Resource.i;
            if(Thread.currentThread().getName().equals("FIRST"))Thread.yield();
            i++;
            Resource.i=i;
        }

    }
}
