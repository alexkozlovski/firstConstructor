package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryIT;

/**
 * Created by user on 13.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        Pizza simplePizza=new SimplePizza();
        System.out.printf("Ingredients: %s %nCost $%.2f",simplePizza.getIngredients(),simplePizza.getCost());

        Pizza pizzaWithSauce=new PizzaWithSauce(simplePizza);
        System.out.printf("%nIngredients: %s %nCost $%.2f",pizzaWithSauce.getIngredients(),pizzaWithSauce.getCost());

        Pizza pizzaWithSauseges=new PizzaWithSausages(pizzaWithSauce);
        System.out.printf("%nIngredients: %s %nCost $%.2f",pizzaWithSauseges.getIngredients(),pizzaWithSauseges.getCost());

        Pizza pizzaWithMushrooms=new PizzaWithMushrooms(pizzaWithSauseges);
        System.out.printf("%nIngredients: %s %nCost $%.2f",pizzaWithMushrooms.getIngredients(),pizzaWithMushrooms.getCost());

    }
}
