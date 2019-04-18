package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6.spaceX.SpaceXProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6.tesla.TeslaProduct;

/**
 * Created by user on 02.11.2018.
 */
public  abstract class AbstractFactory {
    abstract SpaceXProduct getSpaceXProduct(String product);
    abstract TeslaProduct getTeslaProduct(String product);
}
