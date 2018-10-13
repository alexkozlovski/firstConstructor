package SecondTry.Source_Code.OOD.Lessons6_Command.tryIt_naGit;

/**
 * Created by user on 13.10.2018.
 */
public class AppearCommand implements Command {
    private Cat cat;

    public AppearCommand(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void run() {
        cat.appear();
    }
}
