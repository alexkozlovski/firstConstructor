package Quizful.test1;

public class Question18 {
    public static void main(String[] args) {
        Integer oInt1=null;
        Integer oInt2=0;
        final int int1=oInt1;//NPE - java.lang.NullPointerException
        final int int2=oInt2;
        System.out.println(int1==int2);
    }
}
