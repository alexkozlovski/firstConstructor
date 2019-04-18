package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.factory;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.spaceX.*;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.IProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.tesla.ITeslaProduct;


/**
 * Created by user on 17.10.2018.
 */
public class SpaceXFactory extends AbstractFactory {

    public IProduct getSpaceXProduct(String product) {
        if(product.equalsIgnoreCase("Falcon9"))return new Falcon9();
        if(product.equalsIgnoreCase("HyperLoop"))return new HyperLoop();
        return null;
    }


    public IProduct getTeslaProduct(String product) {
        return null;
    }
}
