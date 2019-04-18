package SecondTry.Lessons_Java.pt2_Multithreading.Lessons90_Multithreading_25_ThreadLocalRandom_and_TimeUnit;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        //ThreadLocalRandom random=new ThreadLocalRandom();
        /*Random random1=new ThreadLocalRandom(TimeUnit.SECONDS.toMillis(2));*/
        int ij= (int) Runtime.getRuntime().freeMemory();
        System.out.println(ij);
        List list=new ArrayList();
        ThreadLocalRandom random=ThreadLocalRandom.current();
        System.out.println(random.nextInt(21)-10);
        int var=0;
        int count=0;
        for (int i = 0; i <2200; i++) {
            var=random.nextInt(21)-10;
            if(var!=0) System.out.println(var);
            if(var!=0)count++;
            list.add(new Object().hashCode());
        }
        System.out.println("conter= "+count);
        System.out.println(ij);
    }
}
