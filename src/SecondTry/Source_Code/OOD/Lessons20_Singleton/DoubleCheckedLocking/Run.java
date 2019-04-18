package SecondTry.Source_Code.OOD.Lessons20_Singleton.DoubleCheckedLocking;

public class Run {
    public static void main(String[] args) {
        Thread thread1=new SingletonThread("lola");
        Thread thread2=new SingletonThread2("lola2");
       thread1.run();
       thread2.run();


    }
    static class SingletonThread extends Thread{
        private static volatile Singleton singleton;
        private String context;
        private SingletonThread(String context){
            this.context=context;
        }
        @Override
        public void run() {
            singleton=Singleton.getInstance(context);
            System.out.println(Thread.currentThread().getName()+"   "+singleton.getValue());
        }
    }
    static class SingletonThread2 extends Thread{
        private static volatile Singleton singleton;
        private String context;
        private SingletonThread2(String context){
            this.context=context;
        }
        @Override
        public void run() {
            singleton=Singleton.getInstance(context);
            System.out.println(Thread.currentThread().getName()+"   "+singleton.getValue());
        }
    }
}
