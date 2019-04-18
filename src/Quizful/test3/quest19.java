package Quizful.test3;
/**
 * without throws Exception - compile error, bcs exception must be caught or declared to be thrown int method signature.
 * */
public class quest19  {
    void m1()throws Exception{throw new MyException1();
    }
    void m2(){throw new MyException2();
    }

    public static void main(String[] args) {

    }
}
class MyException1 extends Exception{
}
class MyException2 extends RuntimeException{
}