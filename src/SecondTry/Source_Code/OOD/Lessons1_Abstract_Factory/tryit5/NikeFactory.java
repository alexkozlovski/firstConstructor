package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5.adidas.AdidasProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5.nike.NikeOutwear;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5.nike.NikeProduct;

/**
 * Created by user on 01.11.2018.
 */
public class NikeFactory extends AbstractFactory {
    @Override
    public NikeProduct getNikeProduct(String product) {
        if (product.equalsIgnoreCase("outwear" ))return new NikeOutwear();
        return null;
    }

    @Override
    public AdidasProduct getAdidasProduct(String product) {
        return null;
    }
}
