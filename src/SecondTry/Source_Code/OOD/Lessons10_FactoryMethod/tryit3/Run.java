package SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.tryit3;

/**
 * Created by user on 15.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        ElonMusk director=new SpaceX();
        director.manage("falcon9").make();
        director=new Tesla();
        director.manage("teslamodels").make();
    }
}
