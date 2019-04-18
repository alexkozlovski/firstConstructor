package exams.LeetCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(123);
        list.add(1234);
        String s="";
        s+=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
