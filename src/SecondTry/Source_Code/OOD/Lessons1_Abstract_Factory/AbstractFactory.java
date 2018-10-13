package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory;

import  SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.nike.NikeProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.addidas.AdidasProduct;

public abstract class AbstractFactory {
    abstract AdidasProduct getAdidasProduct(String product);
    abstract NikeProduct getNikeProduct(String product);

}
