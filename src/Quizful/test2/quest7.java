package Quizful.test2;

public class quest7 extends Thread {
    public void go(){
        System.out.println("go");
    }
    public void run(){
        System.out.println("run");
    }
    public void begin(){
        System.out.println("begin");
    }public void execute(){
        System.out.println("execute");
    }
    public static void main(String[] args) {
        //loh pidal'niy) konechno blya run
        new quest7().start();
    }
}
