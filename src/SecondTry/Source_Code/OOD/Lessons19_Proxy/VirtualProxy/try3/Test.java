package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy.try3;

/**
 * Created by user on 16.11.2018.
 */
public class Test {
    public static void main(String[] args) {
        ProxyPage proxyPage=new ProxyPage("twitter.com");
        proxyPage.displayPage();
        proxyPage.displayPage();
        proxyPage.displayPage();
    }
}
