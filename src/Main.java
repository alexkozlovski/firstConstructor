import java.util.ArrayList;
import java.util.TreeSet;

public  class Main {
    private int xl;
    private static int i2;
/*    Main(){
        x1=i2;
    }*/
     static Main main=new Main();
    public static void main(String[] args) {
        A a=new B();
        B b=(B)a;
        System.out.println(a==b);
/*Object o=new String("2");
String str=(String) new Object();
        System.out.println(o);
        System.out.println(str);*/

    int i=0;
    i++;
        System.out.print(i);
        i=i++;
/*        System.out.println(i);
        System.out.println(Main.main.xl);
        ArrayList<Integer> list=new ArrayList<>(2);
        list.add(5);
        list.add(6);
        list.add(1,7);
        System.out.println(list.indexOf(6));
        list.remove(1);
        System.out.println(list.indexOf(6));
        TreeSet<Main> set=new TreeSet();
        set.add(new Main());
        set.add(new Main());
        set.add(new Main());
        System.out.println(set);*/
        System.out.println(new Boolean("tRue"));
    }
    public static void g (final char c2){

    }

}
class A{

}class B extends A{

}