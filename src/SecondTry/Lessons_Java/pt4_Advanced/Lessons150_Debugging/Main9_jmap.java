package SecondTry.Lessons_Java.pt4_Advanced.Lessons150_Debugging;

import java.util.Scanner;

/**
 * Created by user on 18.09.2018.
 */
public class Main9_jmap {
    //под id процесса можно получить дамп хипа
    //jmap -dump:format>b,file dump.txt (processID)
    //jmap -dump:format>b,file dump.txt 5823
    //id процессора можно получить через консоль java
    //jhat dumfile.txt прочитает  по порту 7000
    //-Xprof
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        String s="";
        while(true){
            s=sc.nextLine();
            if (s.equals("exit")||s.equals("stop")||s.equals("0"))break;
            System.out.println(s+"          common output");
            Writer writer=new Writer(s);
            Writer writer2=new Writer(s);
            Writer writer3=new Writer(s);
            Writer writer4=new Writer(s);
            writer.start();
            writer2.start();
            writer3.start();
            writer4.start();
            writer.join();
            writer2.join();
            writer3.join();
            writer4.join();

        }
    }
    public static class Writer extends Thread{
        String s;
        public Writer(String s){
            this.s=s;
        }
        @Override
        public void run() {

            for (int i = 0; i <100; i++) {
                System.out.println(s+"  "+this.getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
