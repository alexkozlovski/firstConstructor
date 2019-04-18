package exams.Tests.ComporableVsComporator.TreeSet.Comporator;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Item> itemSet=new TreeSet<Item>(new ItemComporator());
        itemSet.add(new Item("cucumber",2));
        itemSet.add(new Item("potato",3));
        itemSet.add(new Item("poland",1));
        itemSet.add(new Item("non",0));
        System.out.println(itemSet);

    }
}
