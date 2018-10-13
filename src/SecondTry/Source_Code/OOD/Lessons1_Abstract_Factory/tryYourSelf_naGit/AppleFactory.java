package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Acer.AcerProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Apple.AppleCharger;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Apple.AppleMobilePhone;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Apple.AppleNotebook;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Apple.AppleProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Asus.AsusProduct;

/**
 * Created by user on 11.10.2018.
 */
public class AppleFactory extends AbstractFactory {
    @Override
    AcerProduct getAcerProduct(String product) {
        return null;
    }

    @Override
    AppleProduct getAppleProduct(String product) {
        if(product.equalsIgnoreCase("Apple mobilephone"))return new AppleMobilePhone();
        if(product.equalsIgnoreCase("Apple charger"))return new AppleCharger();
        if(product.equalsIgnoreCase("apple notebook"))return new AppleNotebook();
        return null;
    }

    @Override
    AsusProduct getAsusProduct(String product) {
        return null;
    }
}
