package SecondTry.Source_Code.OOD.Lessons19_Proxy.ProtectionProxy.try1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 16.11.2018.
 */
public class ProxyDBAccess implements DBAccess {
    private String[] categories={"Administrator".toLowerCase(),"User".toLowerCase()};
    private User user;

    public ProxyDBAccess(User user) {
        this.user = user;
    }

    @Override
    public void provideAccess() {
        if (new ArrayList<>(Arrays.asList(categories)).contains(user.getCategory().toLowerCase())){
            new RealDBAccess(user).provideAccess();
        }else {
            System.out.printf("access denied: %s%n",user.getCategory());
        }

/*        for (String s: categories){
            if(user.getCategory().equalsIgnoreCase(s))new RealDBAccess(user).provideAccess();
        }*/

    }
}
