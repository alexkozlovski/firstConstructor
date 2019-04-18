package SecondTry.Lessons_Java.pt4_Advanced.Lessons155_overloading;

/**
 * Created by user on 21.09.2018.
 */
public class Main {

    void method(Parent p){
        System.out.println("parent");
    }
    void method(Child c){
        System.out.println("child");
    }

    public static void main(String[] args) {
      Main main=new Main();
      main.method(null);
    }
}
class Parent{

}
class Child extends Parent{

}