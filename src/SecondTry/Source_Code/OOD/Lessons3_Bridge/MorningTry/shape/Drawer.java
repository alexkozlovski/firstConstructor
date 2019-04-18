package SecondTry.Source_Code.OOD.Lessons3_Bridge.MorningTry.shape;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.MorningTry.color.Pallete;

/**
 * Created by user on 02.11.2018.
 */
public abstract class Drawer {
    protected Pallete pallete;

    public Drawer(Pallete pallete) {
        this.pallete = pallete;
    }
    public abstract void drawShape(String color);
}
