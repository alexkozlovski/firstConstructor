package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons221_RMI_NEPONYAL;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Enumeration;

/**
 * Created by user on 27.09.2018.
 */
public class Client {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context=new InitialContext();
        Enumeration<NameClassPair> e=context.list("rmi:/localhost/");
        while (e.hasMoreElements()){
            System.out.println(e.nextElement().getName());
        }
        IMath iMath=(IMath)context.lookup("rmi:/localhost/imath");
        int res=iMath.add(2,3);
        System.out.println(res);
    }
}
