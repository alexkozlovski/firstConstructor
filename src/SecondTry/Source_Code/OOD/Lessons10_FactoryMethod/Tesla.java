package SecondTry.Source_Code.OOD.Lessons10_FactoryMethod;

/**
 * Created by user on 14.10.2018.
 */
public class Tesla extends ElonMask {
    @Override
    public Product manage() {
        return new TeslaRoadtser();
    }
}
