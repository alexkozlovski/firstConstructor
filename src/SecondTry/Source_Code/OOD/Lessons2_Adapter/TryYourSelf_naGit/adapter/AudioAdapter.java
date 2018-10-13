package SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf_naGit.adapter;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf_naGit.music.AudioPlayer;
import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf_naGit.video.Mp4Player;
import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf_naGit.video.VideoPlayer;

/**
 * Created by user on 11.10.2018.
 */
public class AudioAdapter implements AudioPlayer {

    private VideoPlayer videoPlayer;
    public AudioAdapter(String format){
        if(format.equalsIgnoreCase(".mp4")) videoPlayer=new Mp4Player(){
            @Override
            public void playVideo(String title, String format) {
                System.out.println("Playing "+title+".mp4");
            }
        };
    }

    @Override
    public void playAudio(String title, String format) {
        if(format.equalsIgnoreCase(".mp4"))videoPlayer.playVideo(title,format);
    }
}
