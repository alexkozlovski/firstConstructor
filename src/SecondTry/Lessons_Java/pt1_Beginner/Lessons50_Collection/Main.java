package SecondTry.Lessons_Java.pt1_Beginner.Lessons50_Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List collection= new ArrayList();
        Set collection2=new HashSet();
        Queue collection3=new PriorityQueue();
        Map collection4=new HashMap();

        collection.add("123");
        collection.add("321");
        collection.add("1232");
        collection.remove("321");
        Iterator iterator=collection.iterator();
        for (;iterator.hasNext();) {
            System.out.println(iterator.next());
        }
        collection.forEach(System.out::println);

    }
}
