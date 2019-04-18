package SecondTry.Lessons_Java.pt1_Beginner.Lessons14_Abstract_FInal_Strictfp;

public class ExampleClass {
    void methode(){
        Car car=new Ferrari();
        car.Run();
        MyFinalClass MyFinalClasss=new MyFinalClass();
        MyFinalClasss.someLogic();
    }
}
abstract class Car{
    int speed;
    abstract void Run();
    void Stop(){

    }
}
class Ferrari extends Car{
    @Override
    void Run() {
        speed=134;

    }
}

abstract class Ball{

}
final class MyFinalClass{
    void someLogic(){
        System.out.println("there was something");
    }
}

