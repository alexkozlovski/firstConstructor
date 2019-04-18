package SecondTry.Source_Code.OOD.Lessons16_Null_Object.try1;

import java.util.*;

/**
 * Created by user on 15.11.2018.
 */
public class OSFactory {
    private static List<String> list;
    private static String[] OS={"Windows","MacOS","Ubuntu","ChromeOS"};

    public static AbstractOS createOS(String title){
        list=new ArrayList<>();
        list.addAll(Arrays.asList(OS));
        for (String eachOS:list){
            if (eachOS.equalsIgnoreCase(title)){
                list=null;
                return new RealOS(title);
            }

        }
        list=null;
        return new NullOS();
    }
}
