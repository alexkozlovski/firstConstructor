package Quizful.test3;

import java.util.ArrayList;
import java.util.List;

public class quest8 {
    public static void main(String[] args) {
        List a=new ArrayList<Double>();
        a.add("1.5");
        List<Double> b=new ArrayList<>();
        //b.add("1.44"); compile error String 10) loh)
        System.out.println(a+"  "+b);
    }
}
