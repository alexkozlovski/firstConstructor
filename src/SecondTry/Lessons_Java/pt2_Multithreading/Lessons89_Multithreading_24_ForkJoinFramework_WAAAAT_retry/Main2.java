package SecondTry.Lessons_Java.pt2_Multithreading.Lessons89_Multithreading_24_ForkJoinFramework_WAAAAT_retry;

import java.util.Date;

public class Main2 {
    static long numOfOperations = 10_000_000_000l;

    public static void main(String[] args) {
        System.out.println(new Date());
        long j = 0;
        for (long i = 0; i < numOfOperations; i++) {
            j += i;
        }
        System.out.println(j);
        System.out.println(new Date());
    }
}
