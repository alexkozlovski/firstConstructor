package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5.adidas.AdidasProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5.adidas.AdidasShoes;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5.nike.NikeProduct;

/**
 * Created by user on 01.11.2018.
 */
public class AdidasFactory extends AbstractFactory {
    @Override
    public NikeProduct getNikeProduct(String product) {
        return null;
    }

    @Override
    public AdidasProduct getAdidasProduct(String product) {
        if (product.equalsIgnoreCase("shoes" ))return new AdidasShoes();
        return null;
    }
}
