package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit;

/**
 * Created by user on 11.10.2018.
 */
public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("Apple"))return new AppleFactory();
        if(factory.equalsIgnoreCase("Acer"))return new AcerFactory();
        if(factory.equalsIgnoreCase("Asus")) return new AsusFactory();

        return null;

    }
}
