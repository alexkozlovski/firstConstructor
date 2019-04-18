package SecondTry.Lessons_Java.pt1_Beginner.Lessons50_Collection;



import java.util.*;

public class Queu_Collection {
    public static void main(String[] args) {
        Queue collection=new PriorityQueue();
        collection.add("1");
        collection.add("22");
        collection.add("3");
        collection.add("4");
        collection.offer("5");

        Iterator iterator= collection.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());

        System.out.println(Arrays.asList(collection.toArray()));




    }
}
