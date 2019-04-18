package SecondTry.Source_Code.OOD.Lessons2_Adapter.MorningTry;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.MorningTry.image.PictureViewer;

/**
 * Created by user on 16.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        PictureViewer pictureViewer=new PictureViewer();
        pictureViewer.watchImage("her",".jpg");
        pictureViewer.watchImage("ada",".gif");
        pictureViewer.watchImage("","1");
    }
}
