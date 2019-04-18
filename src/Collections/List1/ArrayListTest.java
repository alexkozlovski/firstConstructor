package Collections.List1;

import SecondTry.obrazovanie_online.Lessons18.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    int a;

    public ArrayListTest(int a) {
        this.a = a;
    }

    public static void main(String[] args)   {
        List<ArrayListTest> list=new ArrayList<>();
        double d=(double) System.currentTimeMillis();
        for (int i = 0; i <50_000_000 ; i++) {
            list.add(new ArrayListTest(i));
        }
        System.out.println(System.currentTimeMillis()-d);
    }
}
