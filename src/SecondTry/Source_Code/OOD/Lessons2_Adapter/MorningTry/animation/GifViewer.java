package SecondTry.Source_Code.OOD.Lessons2_Adapter.MorningTry.animation;

/**
 * Created by user on 16.10.2018.
 */
public class GifViewer implements AnimatedViewer {
    @Override
    public void watchAnimatedImage(String title, String format) {
        System.out.println("watching"+title+" .gif");
    }
}
