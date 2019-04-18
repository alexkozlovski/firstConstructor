package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy;

/**
 * Created by user on 15.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        IPage google=new ProxyPage("google.com");
        IPage twitter=new ProxyPage("twitter.com");
        google.displayPage();
        twitter.displayPage();
        System.out.println();
        google.displayPage();
        twitter.displayPage();
    }
}
