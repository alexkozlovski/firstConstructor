package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod2;

/**
 * Created by user on 02.11.2018.
 */
public abstract class Choice {
    private Query query;

    public Query getQuery() {
        return query;
    }
    public void createQuery(){
        query=new Query();
    }
    public abstract void dyeCar(String color);
    public abstract void nameCar(String name);
    public abstract void typeCar(String type);
    public abstract void maxSpeedCar(int maxSpeed);
    public abstract String getInfo();

}
