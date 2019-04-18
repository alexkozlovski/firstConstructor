package SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf2.img;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf2.adapter.ImageAdapter;

/**
 * Created by user on 02.11.2018.
 */
public class PictureViewer implements ImageViewer {
    @Override
    public void watchImage(String name, String format) {
        switch (format){
            case ".jpg":
                System.out.printf("watching: %s.jpg\n",name);
                break;
            case ".gif":
                new ImageAdapter(name,format);
        }
    }
}
