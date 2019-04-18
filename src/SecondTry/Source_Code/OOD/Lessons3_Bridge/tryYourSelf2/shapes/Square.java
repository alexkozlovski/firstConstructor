package SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf2.shapes;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf2.colors.Pallete;

/**
 * Created by user on 12.10.2018.
 */
public class Square extends Drawer {
    public Square(Pallete pallete) {
        super(pallete);
    }

    @Override
    public void drawImage(String color) {
        switch (color.toLowerCase()){
            case "red":pallete.setColor("red");break;
            case "blue":pallete.setColor("blue");break;
            case "green":pallete.setColor("green");break;
            case "white":pallete.setColor("white");break;
            default:
                System.out.println("Color: undefined Color");
        }
    }
}
