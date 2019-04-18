package Algoritms;

import java.util.Random;

public class CoctailSort {
    public static void main(String[] args) {
        int[] ints=new int[1000];
/*asd*/
        for (int i = 0; i <ints.length ; i++) {
            ints[i]=new Random(System.nanoTime()).nextInt(ints.length*2+1)-ints.length;
        }
        for (int i:ints){
            System.out.printf("%4d%n",i);
        }
        double d=(double) System.currentTimeMillis();
        for (int i = 0,length=ints.length-1; i <=length; i++,length--) {
            int forwardCount=0;
            int backwardCount=0;

            for (int j = i; j < length; j++) {
                if (ints[j] > ints[j + 1]){
                    ints[j] ^= ints[j + 1] ^ (ints[j + 1] = ints[j]);
                    forwardCount++;
                   // System.out.println("forward?");
                }
            }
            for (int j = length; j>i; j--) {
                if (ints[j]<ints[j-1]  ) {
                    ints[j] ^= ints[j - 1] ^ (ints[j - 1] = ints[j]);
                    backwardCount++;
                   // System.out.println("back?");
                }

            }
            System.out.printf("Iteration №%d%n forwardIteration=%d,backwardIteration=%d"+
                    " from ints[%d] to ints[%d]    [",i,forwardCount,backwardCount,i,length);
            for (int j:ints){
                System.out.printf("%4d",j);
            }
            System.out.println("]");
        }
        System.out.println(System.currentTimeMillis()-d);
        /*for (int i=0,i2 = 0,i3=ints.length-1; i <=i3 ; i++) {
            for (int j = i2; j <i3 ; j++) {
                if (ints[j]>ints[j+1])
                    ints[j]^=ints[j+1]^(ints[j+1]=ints[j]);
            }
            for (int j = i3; j >i2 ; j--) {
                if(ints[j]<ints[j]-1){
                    ints[j]^=ints[j+1]^(ints[j+1]=ints[j]);
                }
            }
            i3--;
            System.out.print(i+"    [");
            for (int j:ints){
                System.out.printf("%4d",j);
            }
            System.out.println("]");
        }
        for (int i:ints){
            System.out.printf("%4d",i);
        }*/
    }
}
