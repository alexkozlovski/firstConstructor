package SecondTry.Source_Code.OOD.Lessons8_Decorator;

/**
 * Created by user on 13.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        Pizza simplePizza=new SimplePizza();
        System.out.printf("Ingredients %s %nCost $%.2f",simplePizza.getIngredients(),simplePizza.getCost());


        Pizza pizzaWithMushrooms=new PizzaWitchMushrooms(new SimplePizza());
        System.out.printf("%nIngredients: %s %nCost: $%.2f",pizzaWithMushrooms.getIngredients(),pizzaWithMushrooms.getCost());

        Pizza pizzaWithAllIngredients=new PizzaWithSausages(pizzaWithMushrooms);
        System.out.printf("%nIngredients: %s %nCost $%.2f",pizzaWithAllIngredients.getIngredients(),pizzaWithAllIngredients.getCost());
    }
}
