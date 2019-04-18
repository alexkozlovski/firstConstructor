package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.factory;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.IProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.spaceX.ISpaceXProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.tesla.ITeslaProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.tesla.TeslaModelS;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.tesla.TeslaRoadster;

/**
 * Created by user on 17.10.2018.
 */
public class TeslaFactory extends AbstractFactory {

    public ISpaceXProduct getSpaceXProduct(String product) {
        return null;
    }


    public ITeslaProduct getTeslaProduct(String product) {
        if(product.equalsIgnoreCase("TeslaModelS"))return new TeslaModelS();
        if(product.equalsIgnoreCase("TeslaRoadster"))return new TeslaRoadster();
        return null;
    }
    public static ITeslaProduct getProduct(String product){
        if(product.equalsIgnoreCase("TeslaModelS"))return new TeslaModelS();
        if(product.equalsIgnoreCase("TeslaRoadster"))return new TeslaRoadster();
        return null;
    }
}
