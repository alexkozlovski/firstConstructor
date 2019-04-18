package SecondTry.Lessons_Java.pt1_Beginner.Lessons55_Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set set=new HashSet();
        Set set2=new LinkedHashSet();
        Set set3=new TreeSet();
        set.add("4");
        set.add("23");
        set.add("11");
        set.add("3");
        set.add("2");
        set.add("51");
        set.forEach(p->System.out.print(p+" "));

    }
}
