package SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf_naGit;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf_naGit.colors.Color;
import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf_naGit.shapes.Circle;
import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf_naGit.shapes.Drawer;
import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf_naGit.shapes.Square;

/**
 * Created by user on 12.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        Drawer littleCircle= new Circle(new Color());
        Drawer square=new Square(new Color());
        littleCircle.drawShape("red");
        square.drawShape("blue");
    }
}
