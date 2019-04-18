package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons204_String_compare;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

/**
 * Created by user on 24.09.2018.
 */
public class Main2 {
    public static void main(String[] args) {

    String[] str=new String[]{"ё","Ё","А","Б","Д","Е","Ф","ц"};
    Arrays.sort(str);
    System.out.println(Arrays.toString(str));

    str= new String[]{"ё","Ё","А","Б","Д","Е","Ф","ц"};
    Collator collator= Collator.getInstance(new Locale("ru"));
    ArrayList<String> list=new ArrayList<>();
    Collections.addAll(list,str);
    Collections.sort(list,collator);
    System.out.println(Arrays.toString(list.toArray()));

}

}
