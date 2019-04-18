package SecondTry.obrazovanie_online.Lessons17_mbcheck;

public class Point /*implements IpointCircle*/{
    private double x;
    private double y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;

    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


    public void setX() {

    }


    public void setY() {

    }

    public String getPointInfo(){
        return "x="+getX()+", y="+getY();
    }

/*
    @Override
    public void setX(double x) {

    }

    @Override
    public void setY(double y) {

    }

    @Override
    public void getX(double x) {

    }

    @Override
    public void getY(double y) {

    }*/
}
