package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.a4tech.A4techProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.logitech.LogitechKeyboard;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.logitech.LogitechMouse;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.logitech.LogitechProduct;

/**
 * Created by user on 11.10.2018.
 */
public class LogitechFactory extends AbstractFactory {
    @Override
    LogitechProduct getLogitechProduct(String product) {
        if(product==null)return null;
        if(product.equalsIgnoreCase("Logitech keyboard"))return new LogitechKeyboard();
        if(product.equalsIgnoreCase("logitech mouse"))return new LogitechMouse();
        return null;
    }

    @Override
    A4techProduct getA4techProduct(String product) {
        return null;
    }
}
