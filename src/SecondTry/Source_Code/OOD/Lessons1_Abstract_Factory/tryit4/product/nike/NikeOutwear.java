package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.product.nike;

import SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.tryit4.product.Product;

/**
 * Created by user on 28.10.2018.
 */
public class NikeOutwear implements Product {
    @Override
    public void makeProduct() {
        System.out.println("make nike outwear");
    }
}