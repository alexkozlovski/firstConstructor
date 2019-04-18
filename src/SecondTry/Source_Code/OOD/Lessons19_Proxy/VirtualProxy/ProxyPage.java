package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy;

/**
 * Created by user on 15.11.2018.
 */
public class ProxyPage implements IPage{
    private RealPage realPage;
    private String url;

    public ProxyPage(String url) {
        this.url = url;
    }

    @Override
    public void displayPage() {
        if(realPage==null){
            realPage=new RealPage(url);
        }
        realPage.displayPage();
    }
}
