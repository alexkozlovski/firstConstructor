package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.AbstractFactory;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.product.Product;
import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.product.puma.PumaShoes;

/**
 * Created by user on 28.10.2018.
 */
public class PumaFactory extends AbstractFactory{
    @Override
    public Product getAdidasProduct(String product) {
        return null;
    }

    @Override
    public Product getNikeProduct(String product) {
        return null;
    }

    @Override
    public Product getPumaProduct(String product) {
        if (product.equalsIgnoreCase("shoes"))return new PumaShoes();
        return null;
    }
}
