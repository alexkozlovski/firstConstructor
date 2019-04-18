package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.AbstractFactory.AbstractFactory;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.AbstractFactory.FactoryGenerator;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.product.Product;

/**
 * Created by user on 28.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        AbstractFactory adidasFactory= FactoryGenerator.getFactory("adidas");
        Product adidasShoes=adidasFactory.getAdidasProduct("shoes");
        adidasShoes.makeProduct();
        Product adidasOutwear=adidasFactory.getAdidasProduct("outwear");
        adidasOutwear.makeProduct();

        AbstractFactory pumaFactory=FactoryGenerator.getFactory("puma");
        Product pumaShoes=pumaFactory.getPumaProduct("shoes");
        pumaShoes.makeProduct();


    }
}
