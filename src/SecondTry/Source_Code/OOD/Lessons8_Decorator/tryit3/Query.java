package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryit3;


public class Query {
    SimplePizza pizza;

    public Query(SimplePizza pizza) {
        this.pizza = pizza;
    }

    public SimplePizza setPizzaSizeAndDough(String size,String dough){

            return new SimplePizza(size,dough);

    }
    public SimplePizza setPizzaSizeAndDough(){
        return new SimplePizza("","");

    }

}
