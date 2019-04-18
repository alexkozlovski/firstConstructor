package SecondTry.Source_Code.OOD.Lessons2_Adapter.MorningTry.adapter;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.MorningTry.image.ImageViewer;
import SecondTry.Source_Code.OOD.Lessons2_Adapter.animation.AnimatedImageViewer;
import SecondTry.Source_Code.OOD.Lessons2_Adapter.animation.GifViewer;

/**
 * Created by user on 16.10.2018.
 */
public class ImageAdapter implements ImageViewer{
    private AnimatedImageViewer animatedImageViewer;
    public ImageAdapter(String title,String format){
        if (format.equalsIgnoreCase(".gif"))animatedImageViewer=new GifViewer();
    }
    @Override
    public void watchImage(String titile, String format) {
        if(format.equalsIgnoreCase(".gif"))animatedImageViewer.watchGif(titile,format);
    }
}
