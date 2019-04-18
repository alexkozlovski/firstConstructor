package Quizful.test3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//what will be print on console? 200)
public class quest16 {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();

        map1.put("numb 1",new Integer(100));
        map1.put("numb 2",new Integer(200));
        map1.put("numb 3",new Integer(300));
        List<Map> list=new ArrayList<>();
        list.add(map1);
        list.add(map2);
        HashMap resultMap=(HashMap)list.get(0);
        System.out.println("NUmber: "+resultMap.get("numb 2"));
    }
}
