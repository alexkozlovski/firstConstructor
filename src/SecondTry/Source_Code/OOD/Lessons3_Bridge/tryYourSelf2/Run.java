package SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf2;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf2.colors.Color;
import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf2.shapes.Drawer;
import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf2.shapes.Square;

/**
 * Created by user on 12.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        Drawer square1= new Square(new Color());
        square1.drawImage("red");
        square1.drawImage("white");
        square1.drawImage("red");
        
    }
}
