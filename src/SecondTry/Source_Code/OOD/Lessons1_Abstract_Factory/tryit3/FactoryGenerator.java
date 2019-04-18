package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3;

/**
 * Created by user on 14.10.2018.
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if (factory.equalsIgnoreCase("nike"))return new NikeFactory();
        if (factory.equalsIgnoreCase("adidas"))return new AdidasFactory();
        return null;
    }
}
