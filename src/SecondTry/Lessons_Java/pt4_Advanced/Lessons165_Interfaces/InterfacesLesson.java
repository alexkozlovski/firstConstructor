package SecondTry.Lessons_Java.pt4_Advanced.Lessons165_Interfaces;

/**
 * Created by user on 22.09.2018.
 */
public class InterfacesLesson {
    static interface Myinterface{

    }
    public static void main(String[] args) {

    }
}
interface Ishape{
    public static void say(){

    }
}








abstract interface Animal {

    public static  enum E{

    }

    public static interface MyInnerInterface{

    }
    public static class MyInnerClass{

    }
    public static final int i = 5;
    public abstract void eat();
}

interface Cat extends Animal {
    void move();
}

class Tiger implements Animal, Cat {
    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }
}