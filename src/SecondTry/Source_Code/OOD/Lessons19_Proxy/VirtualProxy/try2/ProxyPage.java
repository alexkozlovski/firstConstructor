package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy.try2;

/**
 * Created by user on 15.11.2018.
 */
public class ProxyPage implements Ipage{
    private String url;
    private Page page;

    public ProxyPage(String url) {
        this.url = url;
    }

    @Override
    public void displayPage() {
        if(page!=null&&!url.isEmpty())page.displayPage();
        else {
            page=new Page(url);
            page.displayPage();
        }
    }
}
