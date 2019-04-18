package SecondTry.Source_Code.OOD.Lessons2_Adapter.MorningTry.image;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.adapter.ImageAdapter;

/**
 * Created by user on 16.10.2018.
 */
public class PictureViewer implements ImageViewer {
    @Override
    public void watchImage(String title, String format) {
        if (title.isEmpty()||format.isEmpty()) System.out.println("Incorrect file");
        else
        switch (format){
            case ".img":
                System.out.println("watching "+title+format);break;
            case ".jpg":
                System.out.println("watching "+title+format);break;
            case "jpeg":
                System.out.println("watching "+title+format);break;
            case ".gif":
                new ImageAdapter(format).watchImage(title,format);
                break;
            default:System.out.println("undefined File"); break;
        }



    }
}
