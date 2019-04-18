package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryit3;


public class zhoskayaPizza {

    public Pizza naNahoy(String size, String dough, int numberOfSasages, int numberOfhoorms, int numberOfonion) {

        return new PizzaWithSausages(new PizzaWithMusrooms(new PizzaWithOnion(new SimplePizza(size, dough), numberOfonion), numberOfhoorms), numberOfSasages);
}

}
