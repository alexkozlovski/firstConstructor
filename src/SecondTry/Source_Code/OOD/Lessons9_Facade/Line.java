package SecondTry.Source_Code.OOD.Lessons9_Facade;

/**
 * Created by user on 04.11.2018.
 */
public class Line implements Element {
    private Point firstPoint,secondPoint;

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    @Override
    public void add() {
        System.out.printf("%nAdd line between %s and %s",firstPoint.getPointTitle(),secondPoint.getPointTitle());
    }
}
