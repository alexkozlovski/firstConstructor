package SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf2.adapter;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf2.animation.AnimatedImageViewer;
import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf2.animation.GifViewer;
import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf2.img.ImageViewer;

/**
 * Created by user on 02.11.2018.
 */
public class ImageAdapter {
    private  AnimatedImageViewer animatedImageViewer;
    public ImageAdapter(String name,String format){
        if (format.contains("gif"))animatedImageViewer=new GifViewer();
        animatedImageViewer.watchGif(name, format);
    }

}
