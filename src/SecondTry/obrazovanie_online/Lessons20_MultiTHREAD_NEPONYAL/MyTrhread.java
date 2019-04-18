package SecondTry.obrazovanie_online.Lessons20_MultiTHREAD_NEPONYAL;

public class MyTrhread extends Thread implements Runnable {
    private int delay;
    private String title;
    public  MyTrhread(int delay, String title){
        this.delay=delay;
        this.title=title;
    }
    @Override
    public void run(){
        synchronized (this){
        for (int i = 0; i < 100; i++) {
            System.out.println(i+" - "+title+" thread ");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
    public synchronized void f(){

    }
}
