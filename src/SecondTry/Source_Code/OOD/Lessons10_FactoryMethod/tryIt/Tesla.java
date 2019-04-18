package SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.tryIt;

import SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.*;
import SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.Product;

/**
 * Created by user on 14.10.2018.
 */
public class Tesla extends ElonMask {
    @Override
    public Product manage() {
        return new TeslaRoadtser();
    }
}
