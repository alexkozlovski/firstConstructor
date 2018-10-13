package SecondTry.Source_Code.OOD.Lessons2_Adapter.animation;

/**
 * Created by user on 11.10.2018.
 */
public class GifViewer implements AnimatedImageViewer{
    @Override
    public void watchGif(String title, String format) {
        System.out.println("Watching "+title+" .gif");
    }
}
