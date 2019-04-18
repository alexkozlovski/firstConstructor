package SecondTry.obrazovanie_online.Lessons14;

public class Rectanglle implements Shape {
    private double width;
    private double height;
    public Rectanglle(double width, double height){
        this.height=height;
        this.width=width;
    }
    @Override
    public double P() {

        return (width+height)*2;
    }

    @Override
    public double square() {
        return width*height;
    }
}
