package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryit3;

/**
 * Created by user on 14.10.2018.
 */
public abstract class PizzaDecorator implements Pizza {
    private final int MAX_COUNT = 3;
    private  int count=0;
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza,int count) {
        this.pizza = pizza;
        this.count=count;
    }

    @Override
    public double getTotallyCost() {
        return pizza.getTotallyCost();
    }

    @Override
    public String getIngredients() {
        return pizza.getIngredients();
    }

    public int getMaxCount() {
        return MAX_COUNT;
    }

    public int getCount() {
        if(count>getMaxCount())return getMaxCount();
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getSize() {
        return pizza.getSize();
    }

    @Override
    public String getDough() {
        return pizza.getDough();
    }
}
