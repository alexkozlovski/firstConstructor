package Quizful.test3;

public class quest6 {
    /**
     * сразу вызывается конструктор родителя
     * в нем вызывается переопределенный метод класса-потомкка. потом конструктор потомка и он вызывает свой метод*/
    public static void main(String[] args) {
        A aga=new B();
    }
}
class A{
    A(){
        System.out.println("A");
        a();
    }

    void a() {
        System.out.println("a");
    }
}
class B extends A{
    B(){
        System.out.println("B");
        a();
    }
    void a(){
        System.out.println("b");
    }
}