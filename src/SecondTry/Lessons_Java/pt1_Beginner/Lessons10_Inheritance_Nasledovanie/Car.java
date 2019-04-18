package SecondTry.Lessons_Java.pt1_Beginner.Lessons10_Inheritance_Nasledovanie;

public class Car {
    int maxSpeed=360;
    int numOfSeeds=4;
    String DriveType;
    int getMaxSpeed(){
        return maxSpeed;
    }
    public int getNumOfSeeds(){
        return numOfSeeds;
    }
    public void driving(){
        System.out.println("car is Driving");
    }

}
