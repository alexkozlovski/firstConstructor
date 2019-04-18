package SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.MorningTry;

/**
 * Created by user on 04.11.2018.
 */
public class SpaceX extends Director {
    @Override
    public Product manage() {
        return new Falcon9();
    }
}
