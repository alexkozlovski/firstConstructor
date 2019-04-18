package SecondTry.Lessons_Java.pt1_Beginner.Lessons50_Collection;

import java.util.*;

public class Set_HashSet_Collection {
    public static void main(String[] args) {
        Set collection=new HashSet();
        collection.add("1");
        collection.add("22");
        collection.add("3");
        collection.add("4");
        collection.add("3");
        collection.add("4");
        collection.add("3");
        collection.add("4");
        //Collections.sort(new LinkedList<>(collection));
        Iterator iterator= collection.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next()+"   ");
        System.out.println("\n====================");
        for (Object o:
             collection) {
            System.out.print(o+"    ");
        }
        System.out.println("\n=========================");
        Collection collection1=new HashSet();
        collection1.add("13");
        collection1.add("23");
        collection1.add("332");
        collection1.add("43");
        collection1.add("43");
        Iterator iterator1=collection1.iterator();
        while(iterator1.hasNext()) System.out.print(iterator1.next()+"  ");




    }
}
