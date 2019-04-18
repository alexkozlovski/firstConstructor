package SecondTry.obrazovanie_online.Lessons20_MultiTHREAD_NEPONYAL;

public class Run {
    public static void main(String[] args) {
        Thread t1=new MyTrhread(100,"1st");
        Thread t2=new MyTrhread(200,"2nd");
        Thread t3=new MyTrhread(400,"3rd");
        Thread t4=new MyTrhread(800,"4d");


        t1.start();//start thread
        t2.start();
        t3.start();
        t4.start();

    }
}
