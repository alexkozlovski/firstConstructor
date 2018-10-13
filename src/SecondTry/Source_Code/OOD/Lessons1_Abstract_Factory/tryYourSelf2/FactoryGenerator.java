package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2;

/**
 * Created by user on 11.10.2018.
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if (factory==null)return null;
        if (factory.equalsIgnoreCase("logitech"))return new LogitechFactory();
        if (factory.equalsIgnoreCase("a4tech"))return new A4techFactory();
        return null;
    }
}
