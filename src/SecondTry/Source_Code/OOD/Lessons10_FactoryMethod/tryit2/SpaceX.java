package SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.tryit2;

/**
 * Created by user on 14.10.2018.
 */
public class SpaceX implements Director {
    @Override
    public Product manage() {
        return new Falcon9();
    }
}
