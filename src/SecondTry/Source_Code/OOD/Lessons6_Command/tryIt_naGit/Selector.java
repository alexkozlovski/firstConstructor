package SecondTry.Source_Code.OOD.Lessons6_Command.tryIt_naGit;

/**
 * Created by user on 13.10.2018.
 */
public class Selector {
    Command appear,hide;

    public Selector(Command appear, Command hide) {
        this.appear = appear;
        this.hide = hide;
    }
    public void appear(){
        appear.run();
    }
    public void hide(){
        hide.run();
    }
}
