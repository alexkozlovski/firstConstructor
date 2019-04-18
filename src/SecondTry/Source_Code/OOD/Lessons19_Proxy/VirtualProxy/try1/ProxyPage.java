package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy.try1;

/**
 * Created by user on 15.11.2018.
 */
public class ProxyPage extends Page {

    private Page page;
    private String url;

    public ProxyPage(String url) {
        this.url=url;
    }

    @Override
    public void displayPage() {
        if(page!=null)page.displayPage();
        else {
            page=new RealPage(url);
            page.displayPage();
        }
    }


}
