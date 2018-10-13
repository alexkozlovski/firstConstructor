package SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf_naGit.shapes;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf_naGit.colors.Pallete;

/**
 * Created by user on 12.10.2018.
 */
public class Circle extends Drawer {


    public Circle(Pallete pallete) {
        super(pallete);
    }
    @Override
    public void drawShape(String color) {
        switch (color.toLowerCase()){
            case "red":pallete.setColor("red");break;
            case "blue": pallete.setColor("blue");break;
        }
    }
}
