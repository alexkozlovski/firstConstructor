package SecondTry.Source_Code.OOD.Lessons1_Abstract_Factory.MorningTry.products.spaceX;

/**
 * Created by user on 17.10.2018.
 */
public class Falcon9 implements ISpaceXProduct{
    @Override
    public void makeProduct() {
        System.out.println("make Falcon9");
    }
}
