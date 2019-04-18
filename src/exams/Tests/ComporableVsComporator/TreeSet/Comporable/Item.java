package exams.Tests.ComporableVsComporator.TreeSet.Comporable;

import org.jetbrains.annotations.NotNull;


public class Item implements Comparable<Item>{
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

    @Override
    public int compareTo(@NotNull Item item) {
        return ((this.value>item.value)?(1):(this.value<item.value?-1:0));
/*        if(this.value>item.value)return 1;
        else if(this.value<item.value)return -1;
        else return 0;*/
    }
}

