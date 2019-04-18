package Quizful.test4;


class A{
    public void process(){
        System.out.println("A");
    }
}
public class quest5 extends A{
    public void process() throws RuntimeException{
        super.process();
        if(true)throw new RuntimeException();
        System.out.println("B");
    }

    public static void main(String[] args) {
        try {
            ((A)new quest5()).process();
        }catch (Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
