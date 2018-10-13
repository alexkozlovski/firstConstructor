package SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf_naGit.video;

/**
 * Created by user on 11.10.2018.
 */
public class Mp4Player implements VideoPlayer {
    @Override
    public void playVideo(String title,String format) {
        System.out.println("Watching "+title+".mp4");
    }
}
