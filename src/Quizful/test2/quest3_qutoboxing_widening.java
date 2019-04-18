package Quizful.test2;

public class quest3_qutoboxing_widening {
    public static void var(Integer integer,int i){
        System.out.println("integer int");
    }
    public static void var(Object... objects){
        System.out.println("objects ");
    }
    public static void var(Integer... integers){
        System.out.println("integers");
    }
    public static void var(int... ints){
        System.out.println("ints");
    }

    public static void main(String[] args) {
        var(2,new Integer(127));
    }
}
