package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3.adidas.AdidasProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3.nike.NikeProduct;

/**
 * Created by user on 14.10.2018.
 */
public abstract class AbstractFactory {
    public abstract AdidasProduct getAdidasProduct(String product);
    public abstract NikeProduct getNikeProduct(String product);
}
