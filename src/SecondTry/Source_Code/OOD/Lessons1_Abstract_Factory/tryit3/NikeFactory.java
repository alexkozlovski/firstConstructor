package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3.adidas.AdidasProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3.nike.NikeProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3.nike.NikeShoes;

/**
 * Created by user on 14.10.2018.
 */
public class NikeFactory extends AbstractFactory {
    @Override
    public NikeProduct getNikeProduct(String product) {
        if(product.equalsIgnoreCase("shoes"))return new NikeShoes();
        return null;
    }
    @Override
    public AdidasProduct getAdidasProduct(String product) {
        return null;
    }


}
