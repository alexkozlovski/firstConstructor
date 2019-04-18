package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy.try3;

/**
 * Created by user on 16.11.2018.
 */
public class RealPage implements Page {
    private String url;

    public RealPage(String url) {
        this.url = url;
        downloadPage();
    }

    @Override
    public void displayPage() {
        System.out.printf("Displaying page: %s%n",url);
    }
    private void downloadPage(){
        System.out.printf("Downloading page: %s%n",url);
    }

}
