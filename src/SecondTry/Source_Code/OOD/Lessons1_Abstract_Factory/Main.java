package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.addidas.AdidasProduct;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.nike.NikeProduct;

/**
 * Created by user on 11.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory addidasFactory=FactoryGenerator.getFactory("Adidas");
        AdidasProduct adidasProduct=addidasFactory.getAdidasProduct("adidas shoes");
        adidasProduct.makeAdidasProduct();

        AbstractFactory nikeFactory=FactoryGenerator.getFactory("Nike");
        NikeProduct nikeProduct=nikeFactory.getNikeProduct("nike outwear");
        nikeProduct.makeNikeProduct();


    }
}
