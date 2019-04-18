package SecondTry.obrazovanie_online.Lessons14;

import SecondTry.obrazovanie_online.Lessons9.Rectangle;

public class Run {
    public static void main(String[] args) {
        Shape circle=new Circle(10);
        System.out.println("circle square="+circle.square());
        System.out.println("Rectangle square="+new Rectangle(7,5).square());
        System.out.println("Rectangle P="+new Rectangle(7,5).P());
        Shape rectShape=new Rectanglle(7,5);
        Shape circleShape=new Circle(10);
        System.out.println("rectshape P="+rectShape.P());
        System.out.println("rectshape sqaure="+rectShape.square());
        System.out.println("circleShape P="+circleShape.P());
        System.out.println("circleShape square="+circleShape.square());
        System.out.println("P triangle="+new Triangle(2,3,4).P());
        System.out.println("sq triangle="+new Triangle(2,3,4).square());
        Shape triShape=new Triangle(2,3,4);
        System.out.println("trishape P="+triShape.P());
        System.out.println("trishape sq="+triShape.square());

    }
}
