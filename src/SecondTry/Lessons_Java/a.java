package SecondTry.Lessons_Java;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
/*        String s="12";
        int k=Integer.parseInt(s);

        int d= new Character((char) Integer.parseInt(s));

        System.out.println(d);
       *//* d=Integer.valueOf(s);*//*
       // System.out.println(d);*/
        short d=20;
        print(d);
        int k=new Scanner("12").nextInt();
        System.out.println(k);

    }
    public static void print(int d){
        System.out.println("primitive");
    }
    public static void print(Integer d){
        System.out.println("wrapper");
    }
}
