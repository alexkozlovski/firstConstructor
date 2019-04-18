package SecondTry.Source_Code.OOD.Lessons9_Facade;

/**
 * Created by user on 04.11.2018.
 */
public class Axis implements Element {
    private String axis;

    public Axis(String axis) {
        this.axis = axis;
    }

    @Override
    public void add() {
        System.out.printf("%nAdd %sAxis",axis);
    }
}
