package SecondTry.Source_Code.OOD.Lessons8_Decorator.MorningTry;

/**
 * Created by user on 02.11.2018.
 */
public abstract class PizzaDecorator implements Pizza {
    private  Pizza pizza;

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
