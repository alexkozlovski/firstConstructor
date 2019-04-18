package SecondTry.Source_Code.OOD.Lessons8_Decorator.MorningTry;

/**
 * Created by user on 04.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Pizza pizza=new SimplePizza();
        System.out.println(pizza.getCost()+"    "+pizza.getIngredients());
        pizza=new PizzaWithBacon(pizza);
        System.out.println(pizza.getCost()+"    "+pizza.getIngredients());
        pizza=new PizzaWithSausages(pizza);
        System.out.println(pizza.getCost()+"    "+pizza.getIngredients());
    }
}
