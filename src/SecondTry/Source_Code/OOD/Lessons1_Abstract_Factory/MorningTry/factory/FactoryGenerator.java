package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.factory;

/**
 * Created by user on 17.10.2018.
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("tesla")) return new TeslaFactory();
        if(factory.equalsIgnoreCase("spaceX"))return new SpaceXFactory();
        return null;
    }
}
