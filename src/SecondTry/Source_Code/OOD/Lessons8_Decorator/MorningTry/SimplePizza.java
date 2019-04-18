package SecondTry.Source_Code.OOD.Lessons8_Decorator.MorningTry;

/**
 * Created by user on 02.11.2018.
 */
public class SimplePizza implements Pizza {

    @Override
    public double getCost() {

        return 2;
    }

    @Override
    public String getIngredients() {
        return "PizzaPrototype: ";
    }
}
