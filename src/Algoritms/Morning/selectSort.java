package Algoritms.Morning;

import java.util.Arrays;

public class selectSort {
    public static void main(String[] args) {
        int[] ints=new int[]{3,5,4,7,1,7,2,6,9,8};
        System.out.println(Arrays.toString(ints));
        //ints[0]^=ints[1]^(ints[1]=ints[0]);
        System.out.println(Arrays.toString(ints));
        for (int i = 0,min=i; i < ints.length-1; i++) {
            for (int j = i+1; j <ints.length ; j++) {
                if(ints[j]<ints[min])min=j;
            }
            if(ints[i]>ints[min])ints[i]^=ints[min]^(ints[min]=ints[i]);
            System.out.println(Arrays.toString(ints));
            //  if(ints[min]<ints[i])ints[i]^=ints[min]^(ints[min]=ints[i]);
        }
    }
}
