package SecondTry.Source_Code.OOD.Lessons3_Bridge;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.colors.Color;
import SecondTry.Source_Code.OOD.Lessons3_Bridge.shapes.Drawer;
import SecondTry.Source_Code.OOD.Lessons3_Bridge.shapes.Square;

/**
 * Created by user on 12.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        Drawer drawer=new Square(new Color());
        drawer.drawShape("#00FF00");
        Square square=new Square(new Color());
        square.drawShape("#FF0000");
    }
}
