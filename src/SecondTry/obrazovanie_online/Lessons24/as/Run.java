package SecondTry.obrazovanie_online.Lessons24.as;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Circle circle=new Circle(3,3,2);

        Point[] points=new Point[10];
        List<Point> lp=new ArrayList<Point>();

        for (int i = 0; i <10 ; i++) {
            lp.add(new Point(Math.round(Math.random() * 10), Math.round(Math.random() * 10)));
            // points[i]=new Point(Math.round(Math.random()*10),Math.round(Math.random()*10));
           // System.out.println(points[i].getPointInfo());
        }
        for (Point p:
             lp) {
            boolean ft=circle.verPoint2(p);
            System.out.println(p.getPointInfo()+"   "+circle.verPoint2(p));

        }
/*        for (int i = 0; i <points.length ; i++) {
            System.out.println(circle.verPoint(points[i])+" "+circle.verPoint2(points[i])+" ");
        }*/
/*        circle.verPoint4(points);*/
    }
}
