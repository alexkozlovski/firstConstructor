package Quizful;

class A1{

}
interface  I1{

}
class B1 extends A1 implements I1{}

public class d2 {
    static public void foo(A1 a){
        System.out.println("a");
    }
    static public void foo(B1 a){
        System.out.println("b");
    }
    static public void foo(I1 a){
        System.out.println("I");
    }
    public static void main(String[] args) {
        Integer integer=1000;
        Integer integer1=2000;
        System.out.println((integer*2==integer1)?"yes":"no");
        System.out.println((integer1/2==integer)?"yes":"no");
        System.out.println((integer*2==integer1)^(integer1/2==integer)?"yes":"no");
        A1 a=new B1();
        d2.foo(a);
        d2.foo((I1) a);
        System.out.println(2==new Integer(2));
    }
    class runn implements Runnable{
        @Override
        public void run() {

        }
    }
}
