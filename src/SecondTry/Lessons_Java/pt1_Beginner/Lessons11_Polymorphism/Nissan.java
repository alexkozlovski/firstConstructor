package SecondTry.Lessons_Java.pt1_Beginner.Lessons11_Polymorphism;
import SecondTry.Lessons_Java.pt1_Beginner.Lessons10_Inheritance_Nasledovanie.Car;
public class Nissan extends Car{
    void useCar(Car car){
        car.driving();
        System.out.println(car.getNumOfSeeds());
    }
    @Override
    public int getNumOfSeeds(){
        return 4;
    }
}
