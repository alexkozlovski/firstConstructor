package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod2;

/**
 * Created by user on 02.11.2018.
 */
public class Client {
    private Choice choice;

    public Client(Choice choice) {
        this.choice = choice;
    }
    public Query acceptQuery(){
        System.out.println("order accepted");
        return choice.getQuery();
    }
    public String getOrderDetails(){
       return choice.getInfo();
    }
    public void buildCar(String name,String color,String type,int maxSpeed){
        choice.createQuery();
        choice.dyeCar(color);
        choice.nameCar(name);
        choice.typeCar(type);
        choice.maxSpeedCar(maxSpeed);
    }
}
