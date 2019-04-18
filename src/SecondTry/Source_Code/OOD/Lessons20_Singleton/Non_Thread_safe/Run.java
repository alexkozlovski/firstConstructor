package SecondTry.Source_Code.OOD.Lessons20_Singleton.Non_Thread_safe;

/**
 * Created by user on 18.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Singleton singleton=Singleton.newInstance("val_1");
        Singleton singleton2=Singleton.newInstance("va_l_223231131");
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}
