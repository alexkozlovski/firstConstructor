package SecondTry.Source_Code.OOD.Lessons3_Bridge.MorningTry.shape;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.MorningTry.color.Color;
import SecondTry.Source_Code.OOD.Lessons3_Bridge.MorningTry.color.Pallete;

/**
 * Created by user on 02.11.2018.
 */
public class Circle extends Drawer {

    public Circle(Pallete pallete) {
        super(pallete);

    }

    @Override
    public void drawShape(String color) {
        switch (color){
            case ("#FF0000"):pallete.setColor("Red");break;
            case ("#00FF00"):pallete.setColor("Green");break;
            case ("#0000FF"):pallete.setColor("Blue");break;
            default:
                System.out.println("Undefined color");
        }

    }
}
