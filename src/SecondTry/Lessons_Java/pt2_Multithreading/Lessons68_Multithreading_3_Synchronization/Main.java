package SecondTry.Lessons_Java.pt2_Multithreading.Lessons68_Multithreading_3_Synchronization;

public class Main {
    public static void main(String[] args) throws Exception{
        Resource resource=new Resource();
        resource.setI(5);
        MyThread myThread=new MyThread();
        MyThread myThread2=new MyThread();
        myThread.setName("one");
        myThread2.setName("two");
        myThread.setResource(resource);
        myThread2.setResource(resource);
        myThread.start();
        myThread2.start();
        myThread.join();
        myThread2.join();
        System.out.println(resource.getI());

    }
}
class MyThread extends Thread{
    Resource resource;

    public void setResource(Resource resource) {
        super.resume();
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
    }
}
class Resource{
    private int i;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }
    public /*synchronized*/ void changeI(){
        synchronized (this){

            int i=this.i;
            if(Thread.currentThread().getName().equals("one"))Thread.yield();
            i++;
            this.i=i;
            System.out.println(Thread.currentThread().getName()+"   "+i);
        }
    }
}