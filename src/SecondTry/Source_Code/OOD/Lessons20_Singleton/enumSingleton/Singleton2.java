package SecondTry.Source_Code.OOD.Lessons20_Singleton.enumSingleton;

public abstract  class Singleton2{
    private Singleton2(String context,String name){
        value=context;
        this.name=name;
    }
    public abstract String getValue();
    public static final Singleton2 _instance;
    private static final Singleton2 $VALUES[];
    String value;
    public  final String name;

    static {
        _instance=new Singleton2("my value","_instance") {
            @Override
            public String getValue() {
                return value;
            }
        };
        $VALUES=(new Singleton2[]{_instance});
    }
    public static Singleton2[] values(){
        return (Singleton2[]) $VALUES.clone();
    }

    @Override
    public String toString() {
        return this.name+" "+this.value;
    }
}
