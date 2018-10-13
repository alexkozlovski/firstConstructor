package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Acer.AcerMobilePhone;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Acer.AcerNotebook;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Acer.AcerProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Apple.AppleProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Asus.AsusProduct;

/**
 * Created by user on 11.10.2018.
 */
public class AcerFactory extends AbstractFactory {
    @Override
    AcerProduct getAcerProduct(String product) {
        if(product.equalsIgnoreCase("Acer mobilephone"))return new AcerMobilePhone();
        if(product.equalsIgnoreCase("Acer notebook"))return new AcerNotebook();
        return null;
    }

    @Override
    AppleProduct getAppleProduct(String product) {
        return null;
    }

    @Override
    AsusProduct getAsusProduct(String product) {
        return null;
    }
}
