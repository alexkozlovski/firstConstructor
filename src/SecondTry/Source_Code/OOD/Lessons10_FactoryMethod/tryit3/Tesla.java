package SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.tryit3;

import SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.tryit3.ElonMusk;

/**
 * Created by user on 15.10.2018.
 */
public class Tesla extends ElonMusk {
    @Override
    public Product manage(String product) {
        if(product.equalsIgnoreCase("teslaRoadster"))return new TeslaRoadster();
        if (product.equalsIgnoreCase("teslamodelS"))return new TeslModelS();
        return null;
    }
}
