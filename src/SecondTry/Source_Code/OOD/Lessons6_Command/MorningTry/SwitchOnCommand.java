package SecondTry.Source_Code.OOD.Lessons6_Command.MorningTry;

/**
 * Created by user on 02.11.2018.
 */
public class SwitchOnCommand implements Command {
    private Cat cat;

    public SwitchOnCommand(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void run() {
        cat.appear();
    }
}
