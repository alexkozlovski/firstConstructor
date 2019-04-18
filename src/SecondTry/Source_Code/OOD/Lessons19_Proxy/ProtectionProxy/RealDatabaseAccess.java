package SecondTry.Source_Code.OOD.Lessons19_Proxy.ProtectionProxy;

/**
 * Created by user on 15.11.2018.
 */
public class RealDatabaseAccess implements DatabaseAccess {
    private User user;

    public RealDatabaseAccess(User user) {
        this.user = user;
    }

    @Override
    public void provideAccess() {
        System.out.printf("Access confirmed: %s%n",user.getCategory());
    }
}
