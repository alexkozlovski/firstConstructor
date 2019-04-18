package SecondTry.Lessons_Java.pt1_Beginner.Lessons50_Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Book{
    String nameAutor;

    public Book(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAutor='" + nameAutor + '\'' +
                '}';
    }
}
public class Map_HashMap {
    public static void main(String[] args) {
        Map collection=new HashMap();
        collection.put("1","HeadFirstJava");
        collection.put("2",new Book("Java professional"));
        collection.put("3","PHP master");
        //Map.entry("12","12");
        System.out.println(collection.get("2"));
        Set set=collection.entrySet();
        System.out.println("-----------------");
        set.forEach(System.out::println);
    }
}
