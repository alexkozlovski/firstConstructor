package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3.adidas.AdidasProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit3.nike.NikeProduct;

/**
 * Created by user on 14.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        AbstractFactory adidasFactory=FactoryGenerator.getFactory("adidas");
        AdidasProduct adidasProduct=adidasFactory.getAdidasProduct("outwear");
        adidasProduct.makeAdidasProduct();

        AbstractFactory nikeFactory=FactoryGenerator.getFactory("nike");
        NikeProduct nikeProduct=nikeFactory.getNikeProduct("shoes");
        nikeProduct.makeNikeProduct();
    }
}
