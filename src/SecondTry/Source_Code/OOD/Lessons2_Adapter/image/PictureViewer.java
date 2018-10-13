package SecondTry.Source_Code.OOD.Lessons2_Adapter.image;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.adapter.ImageAdapter;

/**
 * Created by user on 11.10.2018.
 */
public class PictureViewer implements ImageViewer {
    @Override
    public void watchImage(String title, String format) {
        switch (format){
            case (".png"):
                System.out.println("watching " + title+".png");
                break;
            case (".jpeg"):
                System.out.println("watching " + title+".jpeg");
                break;
            case (".bmp"):
                System.out.println("watching " + title+".bmp");
                break;
            case (".gif"):
                /*ImageAdapter imageAdapter=new ImageAdapter(format);
                imageAdapter.watchImage(title,format);*/
                new ImageAdapter(format).watchImage(title,format);
                break;
            default:
                System.out.println("Format "+format+" not supported");
        }
    }
}
