package SecondTry.obrazovanie_online.Lessons17_mbcheck;

public class Run {
    public static void main(String[] args) {
        Circle circle=new Circle(1,2,2);

        Point[] points=new Point[10];
        for (int i = 0; i <points.length ; i++) {
            points[i]=new Point(Math.round(Math.random()*10),Math.round(Math.random()*10));
            System.out.println(points[i].getPointInfo());
        }
        for (int i = 0; i <points.length ; i++) {
            System.out.println(circle.verPoint(points[i])+" "+circle.verPoint2(points[i])+" ");
        }
/*        circle.verPoint4(points);*/
    }
}
