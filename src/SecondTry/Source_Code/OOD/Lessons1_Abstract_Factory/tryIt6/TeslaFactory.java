package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6.spaceX.SpaceXProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6.tesla.TeslaProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6.tesla.TeslaRoadster;

/**
 * Created by user on 02.11.2018.
 */
public class TeslaFactory extends AbstractFactory{
    @Override
    SpaceXProduct getSpaceXProduct(String product) {

        return null;
    }

    @Override
    TeslaProduct getTeslaProduct(String product) {
        if(product.toLowerCase().contains("roadster")) return new TeslaRoadster();
        return null;
    }
}
