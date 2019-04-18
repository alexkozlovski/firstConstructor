package Collections.List1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    int a;

    public LinkedListTest(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        List<LinkedListTest> list=new LinkedList<LinkedListTest>();

        double d=(double) System.currentTimeMillis();
        for (int i = 0; i <50_000_000 ; i++) {
            list.add(new LinkedListTest(i));
        }
        System.out.println(System.currentTimeMillis()-d);
    }
}
