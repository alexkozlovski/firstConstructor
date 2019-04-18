package SecondTry.Lessons_Java.pt4_Advanced.Lessons158_multiple_inheritence;

/**
 * Created by user on 21.09.2018.
 */
public class MultipleInheritenceLesson {
    public static void main(String[] args) {
Car car=new Toyota();
car.drive();
    }
}


interface Car{
    void drive();
}
interface Motocycle{
    void drive();
}
class Toyota implements Car{
    public void drive(){
        System.out.println("toyota go");
    }
}
class Yamaha implements Motocycle{
    public void drive(){
        System.out.println("yamaha go");
    }
}