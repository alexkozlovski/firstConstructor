package SecondTry.Source_Code.OOD.Lessons20_Singleton.Non_Thread_safe;

/**
 * Created by user on 18.11.2018.
 */
public class Singleton {
    private static Singleton _instance;
    private String value;

    public Singleton(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
  /**
   *
  * @param context - String value
   * @return _instance after processing
  * */
    public static Singleton newInstance(String context) {
        /**
         * lazy initialization*/
        if (_instance != null) {
            return _instance;
        } else {
            _instance = new Singleton(context);
            return _instance;
        }
    }
}
