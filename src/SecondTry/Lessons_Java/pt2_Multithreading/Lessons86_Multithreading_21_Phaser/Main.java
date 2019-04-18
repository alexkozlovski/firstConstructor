package SecondTry.Lessons_Java.pt2_Multithreading.Lessons86_Multithreading_21_Phaser;

import java.util.concurrent.Phaser;

public class Main {
    public static void main(String[] args) {
        Phaser phaser=new Phaser(2);
        new Washer(phaser);
        new Washer(phaser);

    }
    static class Washer extends Thread{
        Phaser phaser;

        public Washer(Phaser phaser) {
            this.phaser = phaser;
            start();
        }

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {

                System.out.println(getName()+"  washing the car "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                phaser.arriveAndAwaitAdvance();
            }
        }
    }
}
