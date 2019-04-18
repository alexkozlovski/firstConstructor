package SecondTry.Lessons_Java.pt2_Multithreading.Lessons85_Multithreading_20_CyclicBarier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier=new CyclicBarrier(3,new Run());
        new Sportsman(cyclicBarrier);
        new Sportsman(cyclicBarrier);
        new Sportsman(cyclicBarrier);
    }
    static class Run extends Thread{
        @Override
        public void run() {

            for (int i = 0; i <5 ; i++) {
                System.out.println(i+" lol "+Thread.currentThread().getName());
            }System.out.println("hernya was started");
        }
    }
    static class Sportsman extends Thread{
        CyclicBarrier barrier;

        public Sportsman(CyclicBarrier cyclicBarrier) {
            this.barrier = cyclicBarrier;
            start();
        }

        @Override
        public void run() {

            try {
                barrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
