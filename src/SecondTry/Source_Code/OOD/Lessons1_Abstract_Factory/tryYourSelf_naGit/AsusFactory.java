package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Acer.AcerProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Apple.AppleProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Asus.AsusMobilePhone;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Asus.AsusNoteBook;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Asus.AsusProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Asus.AsusWirelessRouter;

/**
 * Created by user on 11.10.2018.
 */
public class AsusFactory extends AbstractFactory {
    @Override
    AcerProduct getAcerProduct(String product) {
        return null;
    }

    @Override
    AppleProduct getAppleProduct(String product) {
        return null;
    }

    @Override
    AsusProduct getAsusProduct(String product) {
        if(product.equalsIgnoreCase("Asus mobilephone"))return new AsusMobilePhone();
        if(product.equalsIgnoreCase("Asus notebook"))return new AsusNoteBook();
        if(product.equalsIgnoreCase("Asus wireless router")) return new AsusWirelessRouter();
        return null;
    }
}
