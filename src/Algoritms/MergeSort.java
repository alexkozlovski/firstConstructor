package Algoritms;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MergeSort {
    public static void main(String[] args) {
//        int[] ints1=new int[]{1,2,3,4};
//        System.arraycopy(ints1,1,ints1,0,ints1.length-1);
//        System.out.println(Arrays.toString(ints1));
        int[] ints=new int[]{1,4,5,3,2,1,7,22,13,6,20,14,15,17};
        System.out.println(Arrays.toString(merge_sort(ints)));

    }
    public static int[] merge_sort(int[] ints){
        if(ints.length<=1)return ints;
        System.out.println(Arrays.toString(ints));
        int[] left=new int[ints.length/2];
        int[] right=new int[ints.length-left.length];

        System.arraycopy(ints,0,left,0,ints.length/2);
        //System.out.println(Arrays.toString(left));
        System.arraycopy(ints,ints.length/2,right,0,ints.length-left.length);
        System.out.println(Arrays.toString(right));
        merge_sort(left);
        merge_sort(right);

        return merge(left,right);
    }
//(double[] a, double[] b
//double r=new double[a.length+b.length]
//    System.arraycopy(a, 0, r, 0, a.length);//откуда, с какого эл-ту(с откуда), куда, с какого эл-та(в куда),до какого эл-та копироать(откуда)
//    System.arraycopy(b, 0, r, a.length, b.length);
    public static int[] merge(@NotNull int[] left,@NotNull int[] right){
        int[] result=new int[left.length+right.length];
        System.out.println(result.length+"rLength");
        while (left.length>1&&right.length>1){
            if(left[0]<right[0]){
                //result[0]=left[0];
                int[] temp=new int[left.length-1];
                System.arraycopy(left,1,temp,0,left.length-1);
                left=temp;

            }else {
                //result[0]=right[0];
                System.out.println(Arrays.toString(right)+" - right");
                int[] temp=new int[left.length-1];
                System.out.println("before crush "+right.length);
                System.arraycopy(right,0,temp,0,right.length-1);
                right=temp;
            }
            if(left.length>0){
                System.arraycopy(left,0,result,result.length-left.length,left.length);
            }
            if(right.length>0){
                System.arraycopy(right,0,result,result.length-right.length,right.length);
            }
            //System.out.println(Arrays.toString(result));
        }
        System.out.println("result! :"+Arrays.toString(result));
        return result;
    }
}