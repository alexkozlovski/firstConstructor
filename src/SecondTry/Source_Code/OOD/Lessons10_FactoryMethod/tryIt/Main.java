package SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.tryIt;

import SecondTry.Source_Code.OOD.Lessons10_FactoryMethod.ElonMask;

/**
 * Created by user on 14.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        ElonMask director=new Tesla();
        director.manage().make();
    }
}
