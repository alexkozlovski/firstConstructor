package exams.Tests.Autoboxing;


import java.util.Random;

public class Rr {
public final void go(){
    System.out.println("asd");
}
    public static void main(String[] args) {
        int[][] array=new int[10][10];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j]=new Random().nextInt(5+1)+5;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.printf("%4d ",array[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("\n\n\n");
        for (int i[]:array){
            for (int j:i){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }
}

}