package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.addidas.AdidasOuterwear;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.addidas.AdidasProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.addidas.AdidasShoes;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.nike.NikeProduct;

/**
 * Created by user on 11.10.2018.
 */
public class AdidasFactory extends AbstractFactory {
    @Override
    AdidasProduct getAdidasProduct(String product) {
        if (product==null)return null;
        if (product.equalsIgnoreCase("ADIDAS OUTWEAR"))return new AdidasOuterwear();
        if (product.equalsIgnoreCase("ADIDAS SHOES"))return new AdidasShoes();

        return null;
    }

    @Override
    NikeProduct getNikeProduct(String product) {
        return null;
    }
}
