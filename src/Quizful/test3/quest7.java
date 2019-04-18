package Quizful.test3;

public class quest7 {
    public static void main(String[] args) {
        A2 a=new B2();
        a.b();
    }
}
class A2{
    void a(){
        System.out.println("A-a");
    }
    void b(){
        System.out.println("A-b");
        a();
    }
}
class B2 extends A2{
    void a(){
        System.out.println("B-a");
    }
    void b(){
        System.out.println("B-b");
        super.b();
    }
}