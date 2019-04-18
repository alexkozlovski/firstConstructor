package SecondTry.obrazovanie_online.Lessons7;

import SecondTry.obrazovanie_online.Lessons18.Collection;

import java.util.Collections;
import java.util.Iterator;

public class kolvostroksnull {
    public static void main(String[] args) {

        int[][] ar=new int[5][5];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j <ar.length ; j++) {
                ar[i][j]=(int)Math.round(Math.random()*10);
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j <ar.length ; j++) {
                System.out.printf("%3d",ar[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i <ar.length-1 ; i++) {
            for (int j = 0; j <2 ; j++) {
                ar[i][j]=0;

            }
        }

        System.out.println("_____________________________________");
        for (int i = 0; i < ar.length; i++) {

            for (int j = 0; j <ar.length ; j++) {
                System.out.printf("%3d",ar[i][j]);
            }
            System.out.println();
        }
        int counter=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j <ar.length ; j++) {
                if(ar[i][j]==0){
                    counter+=1;
                    break;
                }
            }
        }
        System.out.println(counter);
    }
}
