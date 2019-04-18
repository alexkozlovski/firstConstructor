package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6;


import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6.spaceX.SpaceXProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6.tesla.TeslaProduct;

/**
 * Created by user on 01.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        AbstractFactory tesla=FactoryGenerator.getFactory("tesla");
        TeslaProduct teslaRoadster=tesla.getTeslaProduct("roadster");
        teslaRoadster.makeTeslaProduct();
        AbstractFactory spaceX=FactoryGenerator.getFactory("spaceXfactory");
        SpaceXProduct falcon9=spaceX.getSpaceXProduct("falcon9?");
        falcon9.makeSpaceXProduct();
    }
}
