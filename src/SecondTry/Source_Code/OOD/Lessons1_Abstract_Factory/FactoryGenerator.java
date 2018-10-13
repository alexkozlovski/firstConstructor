package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory;

/**
 * Created by user on 11.10.2018.
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("Adidas"))return new AdidasFactory();
        if (factory.equalsIgnoreCase("Nike"))return new NikeFactory();
        return null;
    }
}
