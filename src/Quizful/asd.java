package Quizful;

import java.util.ArrayList;
import java.util.List;

public class asd {
    static byte m1(){
        final char c1='\u0001';
        return c1;
    }
/*    static byte m2(final char c2){
        return c2;
    }*/ //ERROR

    public static void main(String[] args) {
        System.out.println((-7%5)>(7%-5));
        System.out.println(Math.abs(Math.ceil(-2.5))<Math.ceil(Math.abs(-2.5)));
        System.out.println(0.0/0.0+10);
        List<Integer> list=new ArrayList<>(3);
        list.add(new Integer(100));
        list.add(new Integer(200));
        list.add(new Integer(300));
        list.add(new Integer(400));
        System.out.println(list.size());
        final Integer i=1;
        Class c1=new ArrayList<String>().getClass();
        Class c2=new ArrayList<Integer>().getClass();
        System.out.println(c1==c2);
        char c3='\u0003';
        System.out.println(""+m1());
    }
}
