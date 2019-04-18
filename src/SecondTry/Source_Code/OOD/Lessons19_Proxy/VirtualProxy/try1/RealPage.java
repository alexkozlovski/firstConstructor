package SecondTry.Source_Code.OOD.Lessons19_Proxy.VirtualProxy.try1;

/**
 * Created by user on 15.11.2018.
 */
public class RealPage extends Page {
    private String url;

    public RealPage(String url) {
        this.url = url;
        downloadPage();
    }


    public void downloadPage() {
        System.out.printf("Downloading '%s'%n",url);
    }

    @Override
    public void displayPage() {
        System.out.printf("Displaying '%s'%n",url);
    }
}
