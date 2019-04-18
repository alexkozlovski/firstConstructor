package exams.Tests.ThreadMainClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test extends Thread {
    public static void main(String[] args) {
        new Test().start();
        List a=new ArrayList<Double>();
        a.add("1.2");
        System.out.println(6^3);
        Map map=new HashMap<String,Integer>();
        map.put("as",2);
        Map map1=new HashMap<String,Integer>();
        List<Map> list=new ArrayList<Map>();
        list.add(map);
        list.add(map1);
        System.out.println(Integer.toBinaryString(41));
        System.out.println(Integer.toBinaryString(20));
        int x=2;
        int y=3;
        x=x^y;
        y=y^x;
        x=x^y;
        x^=y^(y=x);
        System.out.println(x);
    }
    /*
    0001 1
    0010 2
    0011 3
    0100 4
    0101 5
    0111 6
    1000 7
    1001 8
    */
}
class A{
    A(){
        System.out.println("A");
        a();
    }
    void a(){
        System.out.println("a");
    }
}
class B extends Throwable {
    B(){
        System.out.println("B");
        a();
    }
    void a(){
        System.out.println("B");
    }
}