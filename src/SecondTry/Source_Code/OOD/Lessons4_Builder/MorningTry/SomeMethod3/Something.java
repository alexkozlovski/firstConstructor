package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod3;

/**
 * Created by user on 02.11.2018.
 */
public class Something extends Choice {
    @Override
    public void makeSomething(String something) {
        this.getQuery().setName(something);
    }

    @Override
    public void paintSomething(String color) {
        this.getQuery().setColor(color);
    }
}
