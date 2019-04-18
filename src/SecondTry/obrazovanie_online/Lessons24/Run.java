package SecondTry.obrazovanie_online.Lessons24;

import java.util.*;

public class Run {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        for (int i = 0; i <10 ; i++) {
            set.add(i*2);
        }
        for (Integer i:set) {
            System.out.print(i+"    ");
        }
        System.out.println("\n===================================");

        Set<Double> set1=new LinkedHashSet<>();
        set1.add(23.14);
        set1.add(2.15);
        set1.add(2123.14);
        set1.add(23.14);
        set1.add(-1.14);
        for (Double i:set1) {
            System.out.print(i+"    ");
        }





    }
}
