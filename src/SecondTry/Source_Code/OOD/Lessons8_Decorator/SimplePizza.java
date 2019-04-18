package SecondTry.Source_Code.OOD.Lessons8_Decorator;

/**
 * Created by user on 13.10.2018.
 */
public class SimplePizza implements Pizza{
    @Override
    public double getCost() {
        return 4.5;
    }

    @Override
    public String getIngredients() {
        return "PizzaPrototype";
    }
    public String getSize(){
        return "thin";
    }
}
