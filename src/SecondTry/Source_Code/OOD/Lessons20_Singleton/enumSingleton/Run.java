package SecondTry.Source_Code.OOD.Lessons20_Singleton.enumSingleton;


public class Run {
    public static void main(String[] args) {
      Singleton singleton=Singleton.INSTANCE;
singleton.go();
        System.out.println(singleton.getValue());
//        System.out.println(5^6&3);//???
        System.out.println(singleton.name());

    }
}
