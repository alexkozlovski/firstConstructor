package SecondTry.obrazovanie_online.Lessons25;

import java.util.Vector;

public class Run {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        for (int i = 1; i <11 ; i++) {
            vector.add((i+1)*2);
        }
        int[] ar=new int[vector.capacity()];

        System.out.println(vector.capacity());

    }
}
