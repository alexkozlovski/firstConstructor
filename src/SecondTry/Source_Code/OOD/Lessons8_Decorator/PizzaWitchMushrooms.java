package SecondTry.Source_Code.OOD.Lessons8_Decorator;

/**
 * Created by user on 13.10.2018.
 */
public class PizzaWitchMushrooms extends PizzaDecorator {
    public PizzaWitchMushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost()+2.0;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+" +Mushrooms";
    }
}
