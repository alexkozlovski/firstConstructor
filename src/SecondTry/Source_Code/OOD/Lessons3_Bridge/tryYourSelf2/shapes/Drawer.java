package SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf2.shapes;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf2.colors.Pallete;

/**
 * Created by user on 12.10.2018.
 */
public  abstract class Drawer {
    protected Pallete pallete;

    public Drawer(Pallete pallete) {
        this.pallete = pallete;
    }
    public abstract void drawImage(String color);
}
