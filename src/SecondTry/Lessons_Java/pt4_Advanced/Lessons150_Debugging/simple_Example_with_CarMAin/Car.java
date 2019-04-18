package SecondTry.Lessons_Java.pt4_Advanced.Lessons150_Debugging.simple_Example_with_CarMAin;

/**
 * Created by user on 18.09.2018.
 */
public class Car {
    public int run(int speed, int accelerate){
        return speed+accelerate;
    }

    public static void main(String[] args) {
        System.out.println(new Car().run(4,3));
    }
}
