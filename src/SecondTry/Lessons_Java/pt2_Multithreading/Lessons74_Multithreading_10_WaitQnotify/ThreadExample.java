package SecondTry.Lessons_Java.pt2_Multithreading.Lessons74_Multithreading_10_WaitQnotify;

public class ThreadExample {
    public static void main(String[] args) {
        ThreadB threadB=new ThreadB();
        threadB.start();
        synchronized (threadB){
            try {
                threadB.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadB.total);

    }
    static class ThreadB extends Thread{
        int total;

        @Override
        public void run() {
            synchronized (this){

                for (int i = 0; i <5 ; i++) {
                    total+=i;
                   // Thread.yield();
                    try{
                    sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                notify();
            }
        }
    }
}
