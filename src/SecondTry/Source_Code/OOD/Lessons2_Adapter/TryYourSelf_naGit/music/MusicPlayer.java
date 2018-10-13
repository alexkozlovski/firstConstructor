package SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf_naGit.music;

import SecondTry.Source_Code.OOD.Lessons2_Adapter.TryYourSelf_naGit.adapter.AudioAdapter;

/**
 * Created by user on 11.10.2018.
 */
public class MusicPlayer implements AudioPlayer{
    @Override
    public void playAudio(String title,String format) {
        switch (format){
            case(".mp3"):
                System.out.println("Playing "+title+".mp3");
                break;
            case (".wav"):
                System.out.println("Playing "+title+".wasv");
                break;
            case (".flac"):
                System.out.println("Playing "+title+".flac");
                break;
            case (".mp4"):
                    new AudioAdapter(format).playAudio(title, format);
                    break;
            default:
                System.out.println("Format: "+format+" not supported");
        }

    }
}
