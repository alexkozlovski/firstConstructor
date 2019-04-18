package SecondTry.Lessons_Java.pt2_Multithreading.Lessons84_Multithreading_19_Exchenger;

import java.util.concurrent.Exchanger;

public class Sem {
    public static void main(String[] args) {
        Exchanger<String> exchanger=new Exchanger<>();
        new Mike(exchanger);
        new Anket(exchanger);
    }
    static class Mike extends Thread{
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }
        public void run(){
            try {
                exchanger.exchange("hi my name is Alex");
                /*sleep(2000);*/
                exchanger.exchange("i'm 20 years old");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    static class Anket extends Thread{
        Exchanger<String> exchanger;

        public Anket(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }
        @Override
        public void run(){
            try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
