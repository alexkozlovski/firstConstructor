package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryIT;

/**
 * Created by user on 13.10.2018.
 */
public class PizzaWithSauce extends PizzaDecorator {
    public PizzaWithSauce(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost()+2;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+" +Sauce";
    }
}
