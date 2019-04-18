package exams.Tests.ComporableVsComporator.TreeSet.Comporator;

import java.util.Comparator;

public class Item {
    private String name;
    private int value;

    public Item(String name,int i) {
        this.name=name;
        this.value = i;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item: {"+name+", val="+ value +"}.";
    }
}
class ItemComporator implements Comparator<Item>{
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getValue()-o2.getValue();
    }
}
