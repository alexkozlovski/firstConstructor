package Algoritms.Morning;
import java.util.Arrays;

public class mergeSortingAlgoritm {
    public static void main(String[] args) {
        int[] Array=new int[]{1,2,7,3,1,2,5,8,9,11,14,10,13,6,4};
        System.out.println(Arrays.toString(Array));

    }
    public int[] mergeSort(int[] array){
        if(array.length<1)return array;
        int[]left=new int[array.length/2];
        int[] right=new int[array.length-array.length/2];
        System.arraycopy(array,0,left,0,left.length);
        //System.arraycopy(array,left.length,right,);
        return new int[]{1};
    }
}
