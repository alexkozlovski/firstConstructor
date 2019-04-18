package SecondTry.obrazovanie_online.Lessons9;



public class Lessons9 {
    public static void main(String[] args) {
        MyClass myOb=new MyClass(10);
        myOb.pow();
        System.out.println(myOb.powl(2,6));
        System.out.println(myOb.powl(3,3));

        Rectangle rectangle=new Rectangle(4,5);
        System.out.println("P="+rectangle.P());
        System.out.println("square="+rectangle.square());
        Rectangle[] arRectangle=new Rectangle[10];
        for (int i = 0; i <arRectangle.length ; i++) {
            arRectangle[i]=new Rectangle(1,1);
            arRectangle[i].setHeight(i*2);
            arRectangle[i].setWidth(i);

        }



        for (int i = 0; i <arRectangle.length ; i++) {
            System.out.println(arRectangle[i].toString());
        }
        for (int i = 0; i <arRectangle.length ; i++) {

            System.out.println("P="+arRectangle[i].P()+",   square="+arRectangle[i].square());
        }



    }

}
