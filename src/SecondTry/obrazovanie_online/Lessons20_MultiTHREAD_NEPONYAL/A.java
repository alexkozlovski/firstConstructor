package SecondTry.obrazovanie_online.Lessons20_MultiTHREAD_NEPONYAL;

public class A {
    public void A(){
         new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}
