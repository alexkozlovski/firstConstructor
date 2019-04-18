package SecondTry.Lessons_Java.pt1_Beginner.Lessons27_ARRAYS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
/*
        int [][] j=new int[3][];
        int[] i = {1,2,3,4,5,6,7};
        j[0]=i;
        for (int k = 0; k <j[0].length ; k++) {
            System.out.println(j[0][k]);
        }
        System.out.println("=======================");
        int[] ar=new int[]{1,2,3,4,5};
        System.out.println();
*/


        ArrayList<String> arrayList=new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            arrayList.add("Cat"+i);
        }
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList,new Random(2));
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);




    }
}
