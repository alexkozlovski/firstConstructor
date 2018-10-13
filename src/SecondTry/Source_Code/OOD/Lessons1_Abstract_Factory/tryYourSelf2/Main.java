package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.a4tech.A4techProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryYourSelf2.logitech.LogitechProduct;

/**
 * Created by user on 11.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory logitechFactory=FactoryGenerator.getFactory("logitech");
        LogitechProduct logitechMouse=logitechFactory.getLogitechProduct("logitech mouse");
        LogitechProduct logitechKeyboard=logitechFactory.getLogitechProduct("logitech keyboard");
        logitechMouse.makeProduct();
        logitechKeyboard.makeProduct();
        System.out.println("\n\n");

        AbstractFactory a4techFactory=FactoryGenerator.getFactory("a4tech");
        A4techProduct a4techMouse=a4techFactory.getA4techProduct("a4tech mouse");
        A4techProduct a4techHeadPhones=a4techFactory.getA4techProduct("a4tech headPhones");
        a4techMouse.makeProduct();
        a4techHeadPhones.makeProduct();
    }
}
