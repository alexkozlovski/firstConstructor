package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.factory;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.IProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.spaceX.ISpaceXProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.tesla.ITeslaProduct;

/**
 * Created by user on 17.10.2018.
 */
public abstract class AbstractFactory {
    public abstract IProduct getSpaceXProduct(String product);
    public abstract IProduct getTeslaProduct(String product);
}
