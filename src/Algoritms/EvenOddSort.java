package Algoritms;

import java.util.Random;

public class EvenOddSort {
    public static void main(String[] args) {
        int[] ints=new int[20];

        for (int i = 0; i <ints.length ; i++) {
            ints[i]=new Random(System.nanoTime()).nextInt(ints.length*2+1)-ints.length;
        }
        for (int i:ints){
            System.out.printf("%5d",i);
        }
        System.out.println();

    for (int i = 0; i <ints.length ; i++) {
        if(isSorted(ints))break;
        for (int j=(i%2==0)?0:1; j <ints.length-1 ; j++) {
            if (ints[j] > ints[j + 1]){
                ints[j] ^= ints[j + 1] ^ (ints[j + 1] = ints[j]);
            }
        }
        System.out.print("[");
        for (int j:ints){
            System.out.printf("%5d",j);
        }
        System.out.println("]");
    }



    }
    public static boolean isSorted(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            if (array[i]>array[i+1]){
                System.out.printf("opachki: %d[%d] > %d[%d]%n%n",i,array[i],i+1,array[i+1]);
                return false;
            }
        }
        return true;
    }
}
