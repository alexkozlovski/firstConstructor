package SecondTry.Source_Code.OOD.Lessons3_Bridge.MorningTry;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.MorningTry.color.Color;
import SecondTry.Source_Code.OOD.Lessons3_Bridge.MorningTry.shape.Circle;
import SecondTry.Source_Code.OOD.Lessons3_Bridge.MorningTry.shape.Drawer;

/**
 * Created by user on 02.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Drawer myCircle=new Circle(new Color());
        myCircle.drawShape("#0000FF");

    }
}
