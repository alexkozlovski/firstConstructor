package SecondTry.obrazovanie_online.Lessons11;

public class InstanceCounter {
    private static int numInstance=0;
    protected static int getCount(){
        return numInstance;
    }
    private static void addInstance(){
        numInstance++;
    }
    InstanceCounter(){
        InstanceCounter.addInstance();
    }
}
