package SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.tryit3;

/**
 * Created by user on 15.10.2018.
 */
public class SpaceX extends ElonMusk {
    @Override
    public Product manage(String product) {
        if(product.equalsIgnoreCase("Falcon9")) return new Falcon9();
        return null;
    }
}
