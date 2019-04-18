package SecondTry.Lessons_Java.pt2_Multithreading.Lessons90_Multithreading_25_ThreadLocalRandom_and_TimeUnit;

import java.util.Random;

public class CommonRand {
    public static void main(String[] args) throws InterruptedException {
        Random random=new Random(System.currentTimeMillis());
        for (int i = 0; i <10 ; i++) {

            System.out.println(random.nextInt(16)-5);
            Thread.sleep(100);
        }
    }
}
