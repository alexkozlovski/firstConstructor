package SecondTry.Source_Code.OOD.Lessons3_Bridge.shapes;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.colors.Pallete;

/**
 * Created by user on 12.10.2018.
 */
public class Square  extends Drawer {
    public Square(Pallete pallete) {
        super(pallete);
    }

    @Override
    public void drawShape(String color) {
        switch (color){
            case ("#FF0000"):
                pallete.setColor("Red");break;
            case ("#00FF00"):
                pallete.setColor("Green");break;
            case ("#0000FF"):
                pallete.setColor("Blue");break;
            default:
                System.out.println("Undefined Color");

        }
    }
}

