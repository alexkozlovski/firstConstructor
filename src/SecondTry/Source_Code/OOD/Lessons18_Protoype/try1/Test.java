package SecondTry.Source_Code.OOD.Lessons18_Protoype.try1;

/**
 * Created by user on 15.11.2018.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePizza pizzaWithCheese=new ConcretePizza("Pizza with Cheese");
        pizzaWithCheese.setSize("XL");
        pizzaWithCheese.setSauce("BBQ");
        pizzaWithCheese.setCheese("Mozzarella");
        System.out.println(pizzaWithCheese.getInfo());
        ConcretePizza pizzaWithSausages= (ConcretePizza) pizzaWithCheese.make("Pizza with Sausages");
        pizzaWithSausages.setSausages("Bavarian sausages");
        System.out.println(pizzaWithSausages.getInfo());
    }
}
