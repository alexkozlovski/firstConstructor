package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Acer.AcerProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Apple.AppleProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf_naGit.Asus.AsusProduct;

/**
 * Created by user on 11.10.2018.
 */
public abstract class AbstractFactory {
    abstract AcerProduct getAcerProduct(String product);
    abstract AppleProduct getAppleProduct(String product);
    abstract AsusProduct getAsusProduct(String product);
}
