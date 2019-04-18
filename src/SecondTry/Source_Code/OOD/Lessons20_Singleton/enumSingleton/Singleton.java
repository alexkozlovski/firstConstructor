package SecondTry.Source_Code.OOD.Lessons20_Singleton.enumSingleton;

public enum Singleton {
    INSTANCE("my value");

     Singleton(String context) {
        value=context;
    }

    private String value;

    public String getValue() {
        return value;
    }

    public void go(){
        System.out.println("gogogo");
    }
    public static void goOn(){
        System.out.println("goOn");
    }
}
