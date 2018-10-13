package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Acer.AcerProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Apple.AppleProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Asus.AsusProduct;

/**
 * Created by user on 11.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory appleFactory=FactoryGenerator.getFactory("Apple");
        AppleProduct appleMobilephone=appleFactory.getAppleProduct("apple mobilephone");
        appleMobilephone.makeProduct();
        AppleProduct appleCharger=appleFactory.getAppleProduct("apple charger");
        appleCharger.makeProduct();
        System.out.println("\n");


        AbstractFactory asusFactory=FactoryGenerator.getFactory("Asus");
        AsusProduct asusNotebook=asusFactory.getAsusProduct("asus notebook");
        asusNotebook.makeProduct();
        AsusProduct asusWirelessRouter=asusFactory.getAsusProduct("asus wireless router");
        asusWirelessRouter.makeProduct();
        System.out.println("\n");


        AbstractFactory acerFactory=FactoryGenerator.getFactory("Acer");
        AcerProduct acerNotebook=acerFactory.getAcerProduct("acer notebook");
        acerNotebook.makeProcut();
    }
}
