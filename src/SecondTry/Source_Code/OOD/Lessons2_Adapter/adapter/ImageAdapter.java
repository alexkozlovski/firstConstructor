package SecondTry.Source_Code.OOD.Lessons2_Adapter.adapter;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.animation.AnimatedImageViewer;
import SecondTry.Source_Code.OOD.Lessons2_Adapter.animation.GifViewer;
import SecondTry.Source_Code.OOD.Lessons2_Adapter.image.ImageViewer;

/**
 * Created by user on 11.10.2018.
 */
public class ImageAdapter implements ImageViewer {
    private AnimatedImageViewer animatedImageViewer;
    public ImageAdapter(String format){
        if(format.equalsIgnoreCase(".gif")){
            animatedImageViewer=new GifViewer();
        }
    }
    @Override
    public void watchImage(String title, String format) {
        if(format.equalsIgnoreCase(".gif")){
            animatedImageViewer.watchGif(title,format);
        }
    }
}
