package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons204_String_compare;

import SecondTry.obrazovanie_online.Lessons18.A;
import SecondTry.obrazovanie_online.Lessons18.Collection;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 23.09.2018.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("bb");
        list.add("cc");
        list.add("aa");
        list.add("AA");
        list.add("DD");

        Collator collator=Collator.getInstance();
        collator.setStrength(Collator.PRIMARY);//A=deutscheA A=a
        collator.setStrength(Collator.SECONDARY);//A!=deutscheA A=a
        collator.setStrength(Collator.TERTIARY);//A!=deutscheA A!=a
        Collections.sort(list,collator);
        list.forEach(a->System.out.print(a));
    }
}
