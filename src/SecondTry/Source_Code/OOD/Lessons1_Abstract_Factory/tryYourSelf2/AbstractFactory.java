package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.a4tech.A4techProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.logitech.LogitechProduct;

/**
 * Created by user on 11.10.2018.
 */
public abstract class AbstractFactory {
    abstract LogitechProduct getLogitechProduct(String product);
    abstract A4techProduct getA4techProduct(String product);
}
