package SecondTry.Source_Code.String;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Lessons5_Sort_String_2 {
    public static void main(String[] args) {

        String[] str=new String[]{"ё","Ё","А","Б","Д","Е","Ф","ц","a"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        str= new String[]{"ё","Ё","А","Б","Д","Е","Ф","ц","a"};
        Collator collator= Collator.getInstance(new Locale("ru"));
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,str);
        Collections.sort(list,collator);
        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
