package SecondTry.Source_Code.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lessons5_Sort_String {
    public static void main(String[] args) {
        String[] strings=new String[]{"aa","aaaaa","a","aaaaaaa","BBBB","bbbb","ZZ","DD","ddd","d"};
        System.out.println("array before sort");
        for (String e:
             strings) {
            System.out.println(e);
        }
        System.out.println("+++++++++++++++++++++++++++++==");
        Arrays.sort(strings);
        //System.out.println(Arrays.toString(strings));
        for (String e:
                strings) {
            System.out.println(e);
        }
        ArrayList<String> list=new ArrayList<String>();
        Collections.addAll(list,strings);
        Collections.sort(list);
        System.out.println("array after sort ");
        list.forEach(System.out::println);




    }
}
