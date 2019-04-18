package SecondTry.Source_Code.OOD.Lessons19_Proxy.ProtectionProxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 15.11.2018.
 */
public class ProxyDatabaseAccess implements DatabaseAccess {
    private User user;

    private List<String> categoryList;

    public ProxyDatabaseAccess(User user) {
        this.user = user;
        String[] categories = {"Administrator","User"};
        categoryList=new ArrayList<>(Arrays.asList(categories));
    }

    @Override
    public void provideAccess() {
        RealDatabaseAccess realDatabaseAccess;

            if(categoryList.contains(user.getCategory())){
                realDatabaseAccess=new RealDatabaseAccess(user);
                realDatabaseAccess.provideAccess();
            }else{
                System.out.printf("Access denied: %s%n",user.getCategory());
            }

    }
}
