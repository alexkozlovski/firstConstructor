package SecondTry.obrazovanie_online.Lessons9;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double P(){
        return (width+height)*2;
    }
    public double square(){
        return width*height;
    }
    public static String getInfo(Rectangle rectangle){
        return "Width="+rectangle.getWidth()+", Height="+rectangle.getHeight();

    }
    @Override
    public String toString(){
        return "Width="+this.getWidth()+", Height="+this.getHeight();
    }
}
