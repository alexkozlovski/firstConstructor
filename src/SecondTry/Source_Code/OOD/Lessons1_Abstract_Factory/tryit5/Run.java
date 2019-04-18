package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit5.adidas.AdidasProduct;

/**
 * Created by user on 01.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        AbstractFactory adidas=FactoryGenerator.getFactory("adidas");
        AdidasProduct adikshoes=adidas.getAdidasProduct("shoes");
        adikshoes.makeProduct();
    }
}
