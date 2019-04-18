package SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.tryit2;

/**
 * Created by user on 14.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        Director director=new SpaceX();
        director.manage().makeProduct();
        director=new Tesla();
        director.manage().makeProduct();
    }
}
