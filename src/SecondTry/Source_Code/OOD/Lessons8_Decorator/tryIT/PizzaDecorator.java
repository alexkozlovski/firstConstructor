package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryIT;

/**
 * Created by user on 13.10.2018.
 */
public abstract class PizzaDecorator implements Pizza{
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
