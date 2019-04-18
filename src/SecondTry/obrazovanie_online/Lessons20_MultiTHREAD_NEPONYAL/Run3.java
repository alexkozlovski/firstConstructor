package SecondTry.obrazovanie_online.Lessons20_MultiTHREAD_NEPONYAL;

public class Run3 {
    public static void main(String[] args) {
        Thread[] t=new Thread[200];
        for (int i = 0; i <t.length ; i++) {
            t[i]=new MyTrhread((i+1)*10,"   "+i);
            t[i].start();
        }
    }
}
