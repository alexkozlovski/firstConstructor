package Quizful.test1;

public class Question5 {
    public static void main(String[] args) {
        A5 a=new B5();
        a.m(5.0);
    }
}
class A5{
    public void m(Number n){
        n=5/3;
        System.out.printf("class A, method m:%d%n",n);
    }
}
class B5 extends A5{

    public void m(Double d) {
        d/=3;
        System.out.printf("class B, method m:%d%n",d);
    }
}