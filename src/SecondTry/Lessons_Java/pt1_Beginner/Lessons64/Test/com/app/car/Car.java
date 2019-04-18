package SecondTry.Lessons_Java.pt1_Beginner.Lessons64.Test.com.app.car;

public abstract class Car implements Drive{
    private int speed;
    private String model;
    public Car(String model, int speed){
        this.model=model;
        this.speed=speed;
    }
    @Override
    public void drive(){
        System.out.println("glavnoe dermo poehalo");
    }
    public int getSpeed(){
        return this.speed;
    }
    public String getModel(){
        return this.model;
    }
    public String getInfo(){
        return this.getModel()+this.getSpeed();
    }
}
