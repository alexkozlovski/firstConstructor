package SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.MorningTry;

/**
 * Created by user on 04.11.2018.
 */
public class Run {
    public static void main(String[] args) {
//        Creator elunMusk=new SpaceX();
//        Product spacexProduct=elunMusk.manage();
//        spacexProduct.make();
//        elunMusk=new Tesla();
//        Product teslaProduct=elunMusk.manage();
//        teslaProduct.make();
        Director elunMusk=new SpaceX();
       elunMusk.manage().make();
       elunMusk=new Tesla();
       elunMusk.manage().make();
    }
}
