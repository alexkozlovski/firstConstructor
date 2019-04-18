package Algoritms.Morning;

import Algoritms.MergeSort;

import java.util.Arrays;

public class mergeSort2 {
    public static void main(String[] args) {
        int[] array=new int[]{9,5,1,7,6,4,2,8,1,3,11};
        System.out.println(Arrays.toString(new mergeSort2().mergeSort(array)));

    }

    private int[] mergeSort(int[] array) {
        if(array.length<2)return array;
        int[] left=Arrays.copyOfRange(array,0,array.length/2);
        int[] right=Arrays.copyOfRange(array,array.length-left.length,array.length);
        System.out.println(Arrays.toString(left)+("  1-   ")+ Arrays.toString(right));
//        mergeSort(left);
//        mergeSort(right);
        System.out.println(Arrays.toString(left)+("  2-   ")+ Arrays.toString(right));
        return merge(left,right);
    }

    private int[] merge(int[] left, int[] right) {
        int[] curArray=new int[left.length+right.length];
        //int tmp=(int)Double.NEGATIVE_INFINITY;
//        for (int i = 0; i <curArray.length ; i++) {
//            for (int j = 0; j <left.length ; j++) {
//                for (int k = 0; k <right.length ; k++) {
//
//                }
//            }
//            curArray[i]=tmp;
//        }
        int leftFlag=0;
        int rightFlag=0;
        for (int i = 0; i <curArray.length ; i++) {
            if(leftFlag>right.length-1){
                curArray[i]=right[rightFlag];
                rightFlag++;
            }else if (rightFlag > right.length-1) {
                int a = left[leftFlag];
                curArray[i] = a;
                leftFlag++;
            }else if (left[leftFlag] < right[rightFlag]) {

                curArray[i] = left[leftFlag];
                leftFlag++;
            }
            else {
                curArray[i] =right[rightFlag];
                        rightFlag++;
            }
        }
        System.out.println(Arrays.toString(curArray));
        return curArray;
    }
}
