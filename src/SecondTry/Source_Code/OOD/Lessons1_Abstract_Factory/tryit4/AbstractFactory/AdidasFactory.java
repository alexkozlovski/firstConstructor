package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.AbstractFactory;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.product.Product;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.product.adidas.AdidasOutwear;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.product.adidas.AdidasShoes;

/**
 * Created by user on 28.10.2018.
 */
public  class AdidasFactory extends AbstractFactory{
    @Override
    public Product getAdidasProduct(String product) {
        if (product.equalsIgnoreCase("outwear"))return new AdidasOutwear();
        if(product.equalsIgnoreCase("shoes"))return new AdidasShoes();
        return null;
    }

    @Override
    public Product getNikeProduct(String product) {
        return null;
    }

    @Override
    public Product getPumaProduct(String product) {
        return null;
    }
}
