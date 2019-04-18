package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.AbstractFactory;

/**
 * Created by user on 28.10.2018.
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if (factory.equalsIgnoreCase("adidas"))return new AdidasFactory();
        if(factory.equalsIgnoreCase("puma"))return new PumaFactory();
        if(factory.equalsIgnoreCase("nike"))return new NikeFactory();
        return null;
    }
}
