package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy.try3;

/**
 * Created by user on 16.11.2018.
 */
public class ProxyPage implements Page {
    private String url;
    private RealPage realPage;

    public ProxyPage(String url) {
        this.url = url;
    }

    @Override
    public void displayPage() {
        if(realPage!=null)realPage.displayPage();
        else {
            realPage=new RealPage(url);
            realPage.displayPage();
        }
    }
}
