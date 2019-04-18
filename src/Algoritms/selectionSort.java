package Algoritms;

import java.util.Arrays;
import java.util.Random;

public class selectionSort {
    public static void main(String[] args) throws InterruptedException {
        int[] ints=new int[20];
        for (int i = 0; i <ints.length ; i++) {
            //Thread.sleep(100);
            ints[i]=new Random(System.nanoTime()).nextInt(10)+1;
        }
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i <ints.length -1; i++) {
            int min=i;
            for (int j = i+1; j <ints.length ; j++) {
                if(ints[j]<ints[min])min=j;

            }
            if(ints[min]<ints[i])ints[i]^=ints[min]^(ints[min]=ints[i]);
        }
        System.out.println(Arrays.toString(ints));
    }
}
