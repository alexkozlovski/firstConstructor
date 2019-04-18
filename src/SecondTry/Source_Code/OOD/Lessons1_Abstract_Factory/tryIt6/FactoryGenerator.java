package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryIt6;

/**
 * Created by user on 02.11.2018.
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if (factory.toLowerCase().contains("tesla"))return new TeslaFactory();
        if (factory.toLowerCase().contains("spacex"))return new SpaceXFactory();
            return null;
    }
}
