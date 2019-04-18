package Algoritms;
import java.util.Random;

public class testBubbleSort {
    public static void main(String[] args) {
        int[] ints=new int[20];

        for (int i = 0; i <ints.length ; i++) {
            ints[i]=new Random(System.nanoTime()).nextInt(21)-10;
        }
        for (int i:ints){
            System.out.printf("%4d",i);
        }
        System.out.println();
        for (int i = 0,i2=ints.length-1; i <=i2 ; i++) {
            for (int j = 0; j <i2 ; j++) {
                if (ints[j]>ints[j+1])
                    ints[j]^=ints[j+1]^(ints[j+1]=ints[j]);
            }
            System.out.printf(i+"from ints[%d] to ints[%d] [",0,i2);
            for (int j:ints){
                System.out.printf("%4d",j);
            }
            System.out.println("]");
            i2--;
            }
        for (int i:ints){
            System.out.printf("%4d",i);
        }
    }
}
