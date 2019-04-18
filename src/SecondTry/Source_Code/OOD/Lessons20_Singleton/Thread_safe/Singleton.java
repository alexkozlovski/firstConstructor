package SecondTry.Source_Code.OOD.Lessons20_Singleton.Thread_safe;

class Singleton {
    private String value;
    private static  Singleton _instance;

    public Singleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public static synchronized  Singleton getInstance(String context){
        if (_instance !=null)return _instance;
        else{
            _instance =new Singleton(context);
            return _instance;
        }
    }
}
