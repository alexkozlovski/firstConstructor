package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.a4tech.A4techHeadphones;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.a4tech.A4techProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.a4tech.A4techMouse;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.logitech.LogitechProduct;

/**
 * Created by user on 11.10.2018.
 */
public class A4techFactory extends AbstractFactory {
    @Override
    LogitechProduct getLogitechProduct(String product) {
        return null;
    }

    @Override
    A4techProduct getA4techProduct(String product) {
        if (product==null)return null;
        if(product.equalsIgnoreCase("A4tech mouse"))return new A4techMouse();
        if(product.equalsIgnoreCase("a4tech headphones"))return new A4techHeadphones();
        return null;
    }
}
