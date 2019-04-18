package SecondTry.obrazovanie_online.Lessons14;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape {

    private double d;

    public Circle(double d) {
        this.d=d;
    }


    @Override
    public double P() {
        return 2*PI*(d/2);
    }

    @Override
    public double square() {
        return PI*pow((d/2),2);
    }
}
