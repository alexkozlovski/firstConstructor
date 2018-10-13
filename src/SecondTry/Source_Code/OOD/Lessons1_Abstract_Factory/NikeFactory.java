package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.addidas.AdidasProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.nike.NikeOutwear;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.nike.NikeProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.nike.NikeShoes;

/**
 * Created by user on 11.10.2018.
 */
public class NikeFactory extends AbstractFactory {
    @Override
    AdidasProduct getAdidasProduct(String product) {
        return null;
    }

    @Override
    NikeProduct getNikeProduct(String product) {
        if (product==null)return null;
        if (product.equalsIgnoreCase("Nike OUTWEAR"))return new NikeOutwear();
        if (product.equalsIgnoreCase("Nike SHOES"))return new NikeShoes();
        return null;
    }
}
