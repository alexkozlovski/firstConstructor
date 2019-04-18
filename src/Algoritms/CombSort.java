package Algoritms;

import java.util.Random;

public class CombSort {
    private static final double REDUCTFACT = 1.2473309950103979;
   // private static final double REDUCTFACT = (1+Math.sqrt(5))/2;
    public static int h;
    public static void main(String[] args) throws InterruptedException {

        int[] ints = new int[1000];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random(System.nanoTime()).nextInt(ints.length*2+1) - ints.length;
        }
        for (int i : ints) {
            System.out.printf("%6d", i);
        }
        System.out.println();
        h=(int) Math.round(ints.length / REDUCTFACT);
        double d=(double) System.currentTimeMillis();
        while (!isSorted(ints)) {
                if(h>1)h = updateH(h);
            for (int i = 0; i < ints.length-1;i++) {
                if ((i + h <= ints.length - 1 ) && (ints[i] > ints[i + h])){
                    ints[i] ^= ints[i + h] ^ (ints[i + h] = ints[i]);
                    System.out.printf("was replaced with h=%d: [%d]=%d,[%d]=%d.%n",h,i,ints[i],i+h,ints[i+h]);
                }
/*                else if (ints[i]>ints[i+1]){
                    ints[i]^=ints[i+1]^(ints[i+1]=ints[i]);
                    System.out.println("was used common ");
                }*/
                //System.out.println(h);
            }
            System.out.print("[");
            for (int j:ints){
                System.out.printf("%6d",j);
            }
            System.out.println("]");
        }
        System.out.println(System.currentTimeMillis()-d);


    }
    public static int updateH(int input){
        //if ((int) Math.round(input / REDUCTFACT)<=2)return 0;
        h=(int) (input / REDUCTFACT);
        System.out.println("H: "+h);
        return h;
    }
    public static boolean isSorted(int[] array) throws InterruptedException {
        //System.out.println(h);
       // Thread.sleep(200);
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) return false;
        }
        return true;
    }
}
