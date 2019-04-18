package SecondTry.Lessons_Java.pt1_Beginner.Lessons28_Obertki_AutoBox_RegEX_STRtoInt;

import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main(String[] args) {
        int i=5;
        byte b;
        short s;
        long l;
        boolean bl;
        char ch;
        float f;
        double d;
        Byte bt;
        Short shrt;
        Integer integer;
        Long lng;
        Boolean bln;
        Character chr;
        Float fl;
        Double doubl;
        List<Integer> mylist;
        int j=new Integer("5");
        double dd=(double)Double.MAX_VALUE;
        int ii=Integer.MAX_VALUE;
        System.out.println(ii);

        //------------------------------------------------
        Integer integer1=new Integer(2);
        //integer1++;
        int tempVar=integer1.intValue();
        tempVar++;
        integer1=new Integer(tempVar);
        System.out.println(integer1);
        //------------------------------------------------
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        for (int aaaa: list) {
            System.out.print(aaaa+"     ");
        }

    }
    Object methode(){
        return 1;
    }
}
