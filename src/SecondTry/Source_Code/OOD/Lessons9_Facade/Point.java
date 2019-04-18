package SecondTry.Source_Code.OOD.Lessons9_Facade;

/**
 * Created by user on 04.11.2018.
 */
public class Point implements Element {
    private String pointTitle;

    public Point(String pointTitle) {
        this.pointTitle = pointTitle;
    }

    public String getPointTitle() {
        return pointTitle;
    }

    @Override
    public void add() {
        System.out.printf("%nAdd point %s",pointTitle);
    }
}
