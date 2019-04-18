package SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf2.animation;

/**
 * Created by user on 02.11.2018.
 */
public class GifViewer implements AnimatedImageViewer{
    @Override
    public void watchGif(String name, String extension) {
        if(extension.toLowerCase().contains("gif")) System.out.printf("watching: %s.gif\n",name);
    }
}
