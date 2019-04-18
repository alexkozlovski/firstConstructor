package Algoritms.Morning;

import java.util.ArrayList;
import java.util.Random;

public class CombSortGold {
    private   static final double PHI=(1+Math.sqrt(5))/2;
    public static int H;
    private static boolean isSorted(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>list.get(i+1))return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
    public static int updateH(final int h){
        H=(int)(h/PHI);
        return H;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listInt=new ArrayList<>();

        for (int i = 0; i <10_000_000 ; i++) {
            listInt.add(Integer.valueOf(new Random().nextInt(10_000_000) + 1));
        }
        H=listInt.size();
        long l=System.currentTimeMillis();
        while (!isSorted(listInt)){

        }
        System.out.println(PHI);
    }
}
