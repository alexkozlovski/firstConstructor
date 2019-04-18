package SecondTry.Source_Code.OOD.Lessons8_Decorator.tryit3;

/**
 * Created by user on 14.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        Pizza pizza=new SimplePizza().build("m","thin",1,1,3);
        System.out.println(pizza.getIngredients()+" "+pizza.getTotallyCost());

    }
}
