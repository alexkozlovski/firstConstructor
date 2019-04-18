package SecondTry.Source_Code.OOD.Lessons20_Singleton.enumSingleton;

import java.util.Arrays;

public class Run2 {
    public static void main(String[] args) {
        Singleton2 singleton2=Singleton2._instance;
        System.out.println(singleton2.value);
        System.out.println(singleton2.getValue());
        System.out.println(singleton2.name);
        System.out.println(Arrays.asList(Singleton2.values()));
    }
}
