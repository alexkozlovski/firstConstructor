package SecondTry.Source_Code.OOD.Lessons6_Command.MorningTry;

/**
 * Created by user on 02.11.2018.
 */
public class SwitchOffCommand implements Command{
    private Cat cat;

    public SwitchOffCommand(Cat cat) {
        this.cat = cat;
    }
    @Override
public void run(){
    cat.hide();
}
}
