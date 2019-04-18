package Algoritms.Morning;

import java.util.Random;

//ints[j]^=ints[j+1]^(ints[j+1]=ints[j]);
/*
a=12;
b=5;
a=a^b;


* */
public class bubbleSort {
    public static void main(String[] args) {
        int[] ints=new int[20];
        for (int i = 0; i <ints.length ; i++) {
            ints[i]=new Random().nextInt(101)-50;
            System.out.printf("%d ",ints[i]);
        }
        System.out.println();
        for (int i = 0,i2=ints.length-1; i <i2 ; i++,i2--) {
            for (int j = 0; j <i2 ; j++) {
                if(ints[j]>ints[j+1]){
                    ints[j]^=ints[j+1]^(ints[j+1]=ints[j]);
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("%d ",ints[i]);
        }
    }
}
