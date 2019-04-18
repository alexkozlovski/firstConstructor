package SecondTry.Lessons_Java.pt1_Beginner.Lessons52_List;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List list=new ArrayList();
        List vector=new Vector();
        List linkedList=new LinkedList();
        Stack stack=new Stack();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(5);
        list.forEach(p->vector.add(p));
        //System.out.println(5);
        List list2=new LinkedList();
        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(5);
        list2.forEach(System.out::println);
        list2.add(2,3);
        System.out.println("===========");
        list2.forEach(System.out::println);
        System.out.println(((LinkedList) list2).pollFirst());
        System.out.println(list2);
    }
}
