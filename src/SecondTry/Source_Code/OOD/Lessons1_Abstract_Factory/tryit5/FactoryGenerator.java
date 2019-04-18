package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5;

/**
 * Created by user on 01.11.2018.
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if (factory.equalsIgnoreCase("adidas"))return new AdidasFactory();
        if(factory.equalsIgnoreCase("nike"))return new NikeFactory();
        return null;
    }
}
