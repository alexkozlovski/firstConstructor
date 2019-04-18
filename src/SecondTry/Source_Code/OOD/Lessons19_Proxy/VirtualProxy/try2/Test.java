package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy.try2;

/**
 * Created by user on 15.11.2018.
 */
public class Test {
    public static void main(String[] args) {
        Ipage twitter=new ProxyPage("twitter.com");
        Ipage google=new ProxyPage("google.com");
        twitter.displayPage();
        google.displayPage();
        twitter.displayPage();
        google.displayPage();

    }
}
