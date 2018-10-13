package SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf_naGit;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf_naGit.music.MusicPlayer;

/**
 * Created by user on 11.10.2018.
 */
public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer=new MusicPlayer();
        musicPlayer.playAudio("ok",".mp3");
        musicPlayer.playAudio("alka pugacheva",".wav");
        musicPlayer.playAudio("opera",".mp4");
        musicPlayer.playAudio("kokoko",".petuh");

    }
}
