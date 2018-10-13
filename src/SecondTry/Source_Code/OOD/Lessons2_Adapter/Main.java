package SecondTry.Source_Code.OOD.Lessons2_Adapter;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.image.PictureViewer;

/**
 * Created by user on 11.10.2018.
 */
//структурный шаблон
public class Main {
    public static int test1=0;
    public static int test2=0;
    public Main(){
        test1++;
        test2++;
    }
    public static void main(String[] args) {

        PictureViewer pictureViewer=new PictureViewer();
        pictureViewer.watchImage("space",".png");
        pictureViewer.watchImage("admin",".jpeg");
        pictureViewer.watchImage("square",".bmp");
        pictureViewer.watchImage("animation",".gif");
        pictureViewer.watchImage("image",".jpg");

        }
    }

