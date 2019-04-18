package SecondTry.Lessons_Java.pt1_Beginner.Lessons11_Polymorphism;
import SecondTry.Lessons_Java.pt1_Beginner.Lessons10_Inheritance_Nasledovanie.Car;
public class Main {
    public void useCar(Car car){
        car.driving();
        System.out.println("Hello car from MainTransactionReadCommited_DIRTYREAD class");
    }
    public static void main(String[] args) {
        Main main=new Main();
        main.useCar(new Car());
        System.out.println();

        Car car2=new Nissan();
        System.out.println(" Nissan koro4"+car2.getNumOfSeeds());

    }
}
