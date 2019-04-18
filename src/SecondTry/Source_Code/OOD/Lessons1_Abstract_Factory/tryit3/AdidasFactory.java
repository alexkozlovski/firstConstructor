package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3.adidas.AdidasOutwear;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3.adidas.AdidasProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3.nike.NikeProduct;

/**
 * Created by user on 14.10.2018.
 */
public class AdidasFactory extends AbstractFactory{
    @Override
    public AdidasProduct getAdidasProduct(String product) {
        if (product.equalsIgnoreCase("outwear"))return new AdidasOutwear();
        return null;
    }

    @Override
    public NikeProduct getNikeProduct(String product) {
        return null;
    }
}
