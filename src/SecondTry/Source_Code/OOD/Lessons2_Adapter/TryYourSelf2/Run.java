package SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf2;


import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf2.img.ImageViewer;
import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf2.img.PictureViewer;

public class Run {
    public static void main(String[] args) {
        ImageViewer viewer=new PictureViewer();
        viewer.watchImage("ayopta",".gif");
        viewer.watchImage("e",".jpg");
    }
}
