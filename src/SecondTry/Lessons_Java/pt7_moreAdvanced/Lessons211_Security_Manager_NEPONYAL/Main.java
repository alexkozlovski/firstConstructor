package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons211_Security_Manager_NEPONYAL;

import java.security.Policy;

/**
 * Created by user on 27.09.2018.
 */
public class Main extends Policy{
    public static void main(String[] args) {
        System.setSecurityManager(new SecurityManager());
        System.out.println(System.getProperty("os.name"));
    }
}
