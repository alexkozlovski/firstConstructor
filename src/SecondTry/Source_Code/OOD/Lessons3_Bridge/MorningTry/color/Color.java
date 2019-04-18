package SecondTry.Source_Code.OOD.Lessons3_Bridge.MorningTry.color;

/**
 * Created by user on 02.11.2018.
 */
public class Color implements Pallete {
    @Override
    public void setColor(String color) {
        System.out.printf("shape color: %s\n",color);
    }
}
