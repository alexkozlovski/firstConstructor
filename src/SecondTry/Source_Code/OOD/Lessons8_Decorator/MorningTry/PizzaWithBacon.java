package SecondTry.Source_Code.OOD.Lessons8_Decorator.MorningTry;

/**
 * Created by user on 04.11.2018.
 */
public class PizzaWithBacon extends PizzaDecorator {
    public PizzaWithBacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost()+1.2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+" +Bacon";
    }
}
