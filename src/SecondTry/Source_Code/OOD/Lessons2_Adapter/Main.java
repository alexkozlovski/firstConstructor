package SecondTry.Source_Code.OOD.Lessons2_Adapter;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.image.PictureViewer;

/**
 * Created by user on 11.10.2018.
 */
//структурный шаблон
public class Main {
    public static int test1=0;
    public static int test2=0;
/*    public Main(){
        if(test1>1&&test2>1)return super();
        test1++;
        test2++;
    }*/
    public static void main(String[] args) {
//        Main Class2=new Main();Class2=new Main();Class2=new Main();Class2=new Main();
        PictureViewer pictureViewer=new PictureViewer();
        pictureViewer.watchImage("space",".png");
        pictureViewer.watchImage("cat",".jpeg");
        pictureViewer.watchImage("square",".bmp");
        pictureViewer.watchImage("simpleanimation",".gif");
        pictureViewer.watchImage("image",".jpg");
        System.out.println(test1+"  "+test2);
        }
    }

