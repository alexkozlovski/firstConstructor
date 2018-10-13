package SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf_naGit.shapes;

import SecondTry.Source_Code.OOD.Lessons3_Bridge.tryYourSelf_naGit.colors.Pallete;

/**
 * Created by user on 12.10.2018.
 */
public abstract class Drawer {


    protected Pallete pallete;
    public Drawer(Pallete pallete){
        this.pallete=pallete;
    }
    public abstract void drawShape(String color);
}
