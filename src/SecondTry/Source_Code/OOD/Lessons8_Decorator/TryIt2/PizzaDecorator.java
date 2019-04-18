package SecondTry.Source_Code.OOD.Lessons8_Decorator.TryIt2;

/**
 * Created by user on 13.10.2018.
 */
public class PizzaDecorator implements Pizza {
    Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients();
    }
}
