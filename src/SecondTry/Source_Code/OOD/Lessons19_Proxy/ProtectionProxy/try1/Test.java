package SecondTry.Source_Code.OOD.Lessons19_Proxy.ProtectionProxy.try1;

/**
 * Created by user on 16.11.2018.
 */
public class Test {
    public static void main(String[] args) {
        new ProxyDBAccess(new User("admin")).provideAccess();
        new ProxyDBAccess(new User("guest")).provideAccess();
        new ProxyDBAccess(new User("user")).provideAccess();
    }
}
