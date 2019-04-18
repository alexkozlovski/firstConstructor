package Quizful.test1;

public class Question6 {
    public static void main(String[] args) {
        A a=new B();
        a.b();
    }
}

class A {
    void a() {
        System.out.println("A-a");
    }

    void b() {
        System.out.println("A-b");
        a();
    }
}
class B extends A{
    @Override
    void a() {
        System.out.println("B-a");
    }

    @Override
    void b() {
        System.out.println("B-b");
        super.b();
    }
}
