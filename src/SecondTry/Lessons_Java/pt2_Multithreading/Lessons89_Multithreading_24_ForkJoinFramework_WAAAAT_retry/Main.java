package SecondTry.Lessons_Java.pt2_Multithreading.Lessons89_Multithreading_24_ForkJoinFramework_WAAAAT_retry;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Main {
    static long numOfOperations = 10_000_000_000l;
    static int numOfThreads = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        System.out.println(new Date());
        ForkJoinPool pool = new ForkJoinPool(numOfThreads);
        System.out.println(pool.invoke(new MyFork(0l, numOfOperations)));
/*        long j=0;
        for (long i = 0; i <numOfOperations ; i++) {
            j+=i;
        }
        System.out.println(j);
        System.out.println(new Date());*/
        System.out.println(new Date());
    }

    static class MyFork extends RecursiveTask {
        Long from, to;

        public MyFork(Long from, Long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if ((to - from) <= numOfOperations / numOfThreads) {
                    long j=0;
                for (long i = from; i <to ; i++) {
                    j+=i;

                }
                return j;
            } else {
                long middle = (to + from) / 2;
                MyFork firstHalf=new MyFork(from,middle);
                firstHalf.fork();
                MyFork secondHalf=new MyFork(middle,to);
                long secondValue=secondHalf.compute();
                return (Long)firstHalf.join()+(Long)secondValue;
            }
        }
    }
}
