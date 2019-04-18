package SecondTry.obrazovanie_online.Lessons25;

import java.util.Map;
import java.util.TreeMap;

public class Run_Map_KeyAndValute {
    public static void main(String[] args) {
        Map<Integer,String> myMap=new TreeMap<>();
        myMap.put(1,"one");
        myMap.put(3,"three");
        myMap.put(2,"two");
        System.out.println(myMap.get(2));
        for(Map.Entry<Integer,String> entry:myMap.entrySet()){
            int a=entry.getKey();
            String str=entry.getValue();
            System.out.println("key = "+a+", val = "+str);
        }
        System.out.println(myMap);
    }
}
