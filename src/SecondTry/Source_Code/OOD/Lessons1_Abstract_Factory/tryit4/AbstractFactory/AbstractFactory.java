package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.AbstractFactory;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.product.Product;

/**
 * Created by user on 28.10.2018.
 */
public abstract class AbstractFactory {
    public abstract Product getAdidasProduct(String product);
    public abstract Product getNikeProduct(String product);
    public abstract Product getPumaProduct(String product);

}
