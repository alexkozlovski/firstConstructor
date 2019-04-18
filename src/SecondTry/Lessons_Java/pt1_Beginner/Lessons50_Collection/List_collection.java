package SecondTry.Lessons_Java.pt1_Beginner.Lessons50_Collection;

import java.util.ArrayList;
import java.util.List;

public class List_collection {
    public static void main(String[] args) {
        List collection=new ArrayList();
        collection.add("1233");
        collection.add("2113");
        collection.add("313");
        collection.add("432");
        collection.set(2,999);
        for (int i = 0; i <collection.size() ; i++) {
            System.out.println(collection.get(i));
        }



    }
}
