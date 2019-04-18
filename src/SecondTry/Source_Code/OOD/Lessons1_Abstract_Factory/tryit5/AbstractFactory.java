package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5.adidas.AdidasProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5.nike.NikeProduct;

/**
 * Created by user on 01.11.2018.
 */
public abstract class AbstractFactory {
    public  abstract NikeProduct getNikeProduct(String product);
    public abstract AdidasProduct getAdidasProduct(String product);
}
