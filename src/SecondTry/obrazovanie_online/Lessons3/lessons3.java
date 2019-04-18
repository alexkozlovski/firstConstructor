package SecondTry.obrazovanie_online.Lessons3;

import java.util.Arrays;
import java.util.List;

public class lessons3 {
    public static void main(String[] args) {

        for (int i=25; i>=20;i--){
            System.out.println("hello "+--i);
        }
        int a=(int)Double.POSITIVE_INFINITY;
        int b=(int)Double.POSITIVE_INFINITY;
        boolean bool = a==b;
        System.out.println(!bool);
        int var=5;
        System.out.println("____________________________________-");
        while(var>0){
            System.out.println(var--);
        }



        int xc=1;
        do{
            boolean b1=xc--%2==0;
            if(b1==true) {

                System.out.println("var "+xc+" is evem");
            }else{
                System.out.println("var "+xc+" is odd.");}
        }while(xc>0);
        System.out.println("list___");
        List<Integer>numb= Arrays.asList(1,1,2,3,4,5,55);
        for (int i: numb
             ) {
            System.out.println(i);

        }
        String str=numb.toString();
        StringBuffer buffer=new StringBuffer(str);
        System.out.println(buffer.reverse());
    }


}
