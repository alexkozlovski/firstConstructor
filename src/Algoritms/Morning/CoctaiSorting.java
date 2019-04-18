package Algoritms.Morning;



import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class CoctaiSorting {
    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            intList.add(i);
        }
        //out(intList);
        Collections.shuffle(intList);
        //out(intList);
        long iter=0;
        double d=System.currentTimeMillis();
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        for (int i = 0,length=intList.size()-1; i <intList.size(); i++,length--) {
            for (int j = i; j <length ; j++) {
                if(intList.get(j)>intList.get(j+1)){
                    iter++;
                    int currInt=intList.get(j);
                    intList.set(j,intList.get(j+1));
                    intList.set(j+1,currInt);
                    //out(intList);
                }
            }
            for (int j = length; j >i ; j--) {
                if(intList.get(j)<intList.get(j-1)){
                    iter++;
                    int currInt=intList.get(j);
                    intList.set(j,intList.get(j-1));
                    intList.set(j-1,currInt);
                    //out(intList);
                }
            }
            System.out.printf("%.2f%n",(System.currentTimeMillis()-d)/60000);
        }
        System.out.printf("%n%n%n%d%n",iter);
        out(intList);
        System.out.println(isSorted(intList)+"  "+(System.currentTimeMillis()-d));
        double minute=(System.currentTimeMillis()-d)/60000;
        System.out.printf("%.4f",minute);
    }


    public static void out(List<Integer> list){
        list.forEach(d->System.out.printf("[%d] ",d));
        System.out.println();
    }
    public static boolean isSorted(List<Integer> list){
        for (int i = 0; i <list.size()-1; i++) {
            if(list.get(i)>list.get(i+1))return false;
        }
        return true;
    }
}
