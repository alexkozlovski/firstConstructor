package SecondTry.Lessons_Java.pt1_Beginner.Lessons64.Test.com.app.mazda;


import SecondTry.Lessons_Java.pt1_Beginner.Lessons64.Test.com.app.car.Car;

public class Mazda extends Car {

    public Mazda(String model, int speed) {
        super(model, speed);

    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("mazda poshla?)");
    }

    public String getInfo() {
        return "Mazda, model " + this.getModel() + ", speed=" + this.getSpeed();
    }
}
