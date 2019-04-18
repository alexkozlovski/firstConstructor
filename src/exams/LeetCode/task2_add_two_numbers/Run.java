package exams.LeetCode.task2_add_two_numbers;

import SecondTry.obrazovanie_online.Lessons18.Collection;

import java.util.*;

public class Run {
    public static void main(String[] args) {

        List list=new LinkedList();
        list.add(1);
        list.add(0);
        list.add(2);
        List list1=new LinkedList();
        list1.add(2);
        list1.add(0);
        list1.add(1);
        List list2=addTwoNumbers(list1,list);
        System.out.println(list2);

    }
    public static List addTwoNumbers(List l1,List l2){
        List list;
       Collections.reverse(l1);
       Collections.reverse(l2);
       int a1=Integer.parseInt(l1.toString().replaceAll("\\D",""));
       int a2=Integer.parseInt(l2.toString().replaceAll("\\D",""));
       int a3=a1+a2;
        list= Arrays.asList(new String(""+(a1+a2)));
        Collections.reverse(list);
       return list;
    }
}
