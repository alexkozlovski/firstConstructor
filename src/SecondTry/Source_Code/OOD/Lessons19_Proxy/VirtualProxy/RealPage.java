package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy;

/**
 * Created by user on 15.11.2018.
 */
public class RealPage implements IPage {
    private String url;

    public RealPage(String url) {
        this.url = url;
        downloadPage();
    }

    private void downloadPage() {
        System.out.printf("Downloading page '%s'%n",url);
    }

    @Override
    public void displayPage() {
        System.out.printf("Displaying page '%s'%n",url);
    }
}
