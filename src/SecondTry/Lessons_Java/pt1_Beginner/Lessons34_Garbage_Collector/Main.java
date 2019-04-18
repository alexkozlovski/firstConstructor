package SecondTry.Lessons_Java.pt1_Beginner.Lessons34_Garbage_Collector;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    Object o;
    public static void main(String[] args) {
        methode();

    }
    private  static void methode(){
        Runtime runtime=Runtime.getRuntime();
        System.out.println("total memory before     "+runtime.totalMemory());
        System.out.println("free memory before      "+runtime.freeMemory());
        List<Date> list=new ArrayList<Date>();
        for (int i = 0; i < 1_000; i++) {

            Date date=new Date();
            list.add(date);
            date=null;
            if(i%11==0)System.gc();
        }
        System.out.println("total memory after      "+runtime.totalMemory());
        System.out.println("free memory after       "+runtime.freeMemory());
        System.gc();
        System.out.println("total memory after gc   "+runtime.totalMemory());
        System.out.println("free memory after gc    "+runtime.freeMemory());
    }
    @Override
    protected void finalize(){
        System.out.println("asdasdasdasdasdasdasd");

    }
}
