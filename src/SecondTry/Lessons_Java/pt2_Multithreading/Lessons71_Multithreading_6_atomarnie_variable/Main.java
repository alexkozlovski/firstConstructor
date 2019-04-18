package SecondTry.Lessons_Java.pt2_Multithreading.Lessons71_Multithreading_6_atomarnie_variable;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static AtomicInteger  atomicInteger=new AtomicInteger(0);

    public static void main(String[] args) throws Exception {
        for (int j = 0; j <10000; j++) {
            new MyThread().start();
        }

        Thread.sleep(300);
        System.out.println(atomicInteger.get());

        for (int i = 0; i < 10; i++) {

            new OkoO.OkkOThread().start();
        }
        Thread.sleep(500);
        System.out.println(OkoO.getI());

    }

    static class MyThread extends Thread {
        @Override
        public void run() {

            atomicInteger.incrementAndGet();
        }
    }
    static class OkoO {
       private static int i=0;

       static public  synchronized int getI(){
            return i;
        }

        public synchronized static void setI(int i) {
            OkoO.i = i;
        }
        static class OkkOThread extends Thread{


            @Override
            public void run() {
                synchronized (this){
                    int i=OkoO.getI();
                    i+=1;
                    OkoO.setI(i);
                }
            }
        }
    }
}
