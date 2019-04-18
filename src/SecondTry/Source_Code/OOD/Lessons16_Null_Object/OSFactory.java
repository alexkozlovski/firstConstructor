package SecondTry.Source_Code.OOD.Lessons16_Null_Object;

/**
 * Created by user on 14.11.2018.
 */
public class OSFactory {
    private static final String[] OS={"Windows","MacOS","Ubuntu"};
    public static AbstractOS createObject(String title){
        for (String eachOS:OS){
            if(eachOS.equalsIgnoreCase(title))return new RealOS(title);

        }
        return new NullOS();
    }
}
