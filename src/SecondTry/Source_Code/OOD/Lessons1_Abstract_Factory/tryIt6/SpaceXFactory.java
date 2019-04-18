package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6.spaceX.Falcon9;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6.spaceX.SpaceXProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6.tesla.TeslaProduct;

/**
 * Created by user on 02.11.2018.
 */
public class SpaceXFactory extends AbstractFactory{
    @Override
    SpaceXProduct getSpaceXProduct(String product) {
        if(product.toLowerCase().contains("falcon9")) return new Falcon9();
        return null;
    }

    @Override
    TeslaProduct getTeslaProduct(String product) {
        return null;
    }
}
