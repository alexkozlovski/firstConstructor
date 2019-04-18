package SecondTry.Source_Code.OOD.Lessons19_Proxy.ProtectionProxy.try1;

/**
 * Created by user on 16.11.2018.
 */
public class RealDBAccess implements DBAccess{
    private User user;

    public RealDBAccess(User user) {
        this.user = user;
    }

    @Override
    public void provideAccess() {
        System.out.printf("access confirmed: %s%n",user.getCategory());
    }
}
