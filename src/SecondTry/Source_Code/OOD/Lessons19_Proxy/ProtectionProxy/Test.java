package SecondTry.Source_Code.OOD.Lessons19_Proxy.ProtectionProxy;

/**
 * Created by user on 15.11.2018.
 */
public class Test {
    public static void main(String[] args) {
        DatabaseAccess adminAccess=new ProxyDatabaseAccess(new User("Administrator"));
        adminAccess.provideAccess();

        DatabaseAccess userAccess=new ProxyDatabaseAccess(new User("guest"));
        userAccess.provideAccess();

        DatabaseAccess commonUserAccess=new ProxyDatabaseAccess(new User("User"));
        commonUserAccess.provideAccess();
    }
}
