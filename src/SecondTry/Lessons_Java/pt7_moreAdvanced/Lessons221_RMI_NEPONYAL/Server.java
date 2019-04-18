package SecondTry.Lessons_Java.pt7_moreAdvanced.Lessons221_RMI_NEPONYAL;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by user on 27.09.2018.
 */
public class Server {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context=new InitialContext();
        context.bind("rmi://localhost:1099/imath",new IMathImpl());


    }

}
interface IMath extends Remote{
    int add(int i,int j);
}
class IMathImpl extends UnicastRemoteObject implements IMath{


    protected IMathImpl() throws RemoteException {
    }

    @Override
    public int add(int i, int j) {
        return i+j;
    }
}