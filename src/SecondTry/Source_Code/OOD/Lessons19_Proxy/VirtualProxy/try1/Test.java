package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy.try1;

/**
 * Created by user on 15.11.2018.
 */
public class Test {
    public static void main(String[] args) {
        Page twitter=new ProxyPage("twitter.com");
        Page google=new ProxyPage("google.com");
        twitter.displayPage();
        google.displayPage();
    }
}
