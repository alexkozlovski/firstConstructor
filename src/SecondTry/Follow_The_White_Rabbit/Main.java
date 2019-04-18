package SecondTry.Follow_The_White_Rabbit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean b=false;
        int counter=0;
        int i=0;
        while(b==false){
            System.out.println("pls enter number");
            Scanner sc=new Scanner(System.in);
            int scan=sc.nextInt();
            if(scan==100)break;
            i+=scan;
            counter++;
            System.out.println(", кол-во оценок =    "+counter+" сумма всех== "+i);
        }
        double res=(double) i/(double) counter;
        System.out.println("ср.бл.= "+res+", кол-во оценок =    "+counter+" сумма всех== "+i);

    }
}
