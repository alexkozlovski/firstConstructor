package SecondTry.obrazovanie_online.Lessons20_MultiTHREAD_NEPONYAL;

public class ThisThread implements Runnable {
    private int delay;
    private String title;
    private Thread thread;
    public  ThisThread(int delay, String title){
        this.delay=delay;
        this.title=title;
        thread=new Thread(this);
        thread.start();
    }
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" - "+title+" thread ");
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
 /*   @Override
    public void run(){

    }*/
}
