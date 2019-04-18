package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy.try2;

/**
 * Created by user on 15.11.2018.
 */
public class Page implements Ipage {
    private String url;

    public Page(String url) {
        this.url = url;
        downloadPage();
    }

    public void downloadPage(){
        System.out.printf("Downloading '%s'%n",url);
    }
    @Override
    public void displayPage() {
        System.out.printf("Displaying page '%s'%n",url);
    }
}
