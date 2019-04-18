package SecondTry.Lessons_Java.pt1_Beginner.Lessons54_Maps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map map=new HashMap();
        Map map2=new Hashtable();
        Map map3=new LinkedHashMap();
        Map map4=new TreeMap();
        map3.put("1","one");
        map3.put("2","two");
        map3.put("4","four");
        map3.put("3","three");
        map3.put("5","five");
        Set set=map3.entrySet();

        set.forEach(p->System.out.print(p+" "));
    }
}
