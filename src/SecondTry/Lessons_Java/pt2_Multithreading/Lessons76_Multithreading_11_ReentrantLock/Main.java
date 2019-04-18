package SecondTry.Lessons_Java.pt2_Multithreading.Lessons76_Multithreading_11_ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws Exception {
        Resource resource = new Resource();
        resource.setI(5);
        resource.setJ(5);
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.setName("one");
        // myThread2.setName("two ");
        myThread.setResource(resource);
        myThread2.setResource(resource);
        myThread.start();
        myThread2.start();
        myThread.join();
        myThread2.join();
        System.out.println(resource.getI());
        System.out.println(resource.getJ());

    }
}

class MyThread extends Thread {
    Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
        resource.changeJ();
    }
}

class Resource {
    private int i;
    private int j;
    Lock lock = new ReentrantLock();

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public /*synchronized*/ void changeI() {
        //synchronized (this){

        lock.lock();
        int i = this.i;
        if (Thread.currentThread().getName().equals("one")) Thread.yield();
        i++;
        this.i = i;
        //System.out.println(Thread.currentThread().getName()+"   "+i);
        // }
    }

    public void changeJ() {
        int j = this.j;
        if (Thread.currentThread().getName().equals("one")) Thread.yield();
        j++;
        this.j = j;
        lock.unlock();
    }
}