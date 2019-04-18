package SecondTry.obrazovanie_online.Lessons24.as;

import static java.lang.Math.abs;

public class Circle {
    private double x;
    private double y;
    private double r;
    private Point point;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }

    public boolean verPoint(Point point) {
        double xc = x;
        double yc = y;
        double xp = point.getX();
        double yp = point.getY();
        if (Math.pow(xp - xc, 2) + Math.pow(yp - yc, 2.0) <= Math.pow(r, 2)) return true;
        else return false;

    }

    public boolean verPoint2(Point point) {
        double xc = x;
        double yc = y;
        double xp = point.getX();
        double yp = point.getY();
        if (abs(xc - r + 100) <= xp + 100 && abs(xc + r + 100) >= xp + 100 && abs(yc - r + 100) <= yp + 100 && abs(yc + r + 100) >= yp + 100)
            return true;
        else return false;
    }

    public boolean verPoint3(Point point) {

        return true;
    }

/*    public void verPoint4(Point[] points) {

        boolean b=true;
        for (int i = 0; i < points.length; i++) {
            if (Math.pow(point.getX() - points[i].getX(), 2) + Math.pow(point.getY() - point.getY(), 2.0)
                    <= Math.pow(r, 2))
                System.out.println("true");
            else System.out.println("false");
        }


    }*/
}
