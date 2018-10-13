package SecondTry.Source_Code.OOD.Lessons6_Command;

/**
 * Created by user on 13.10.2018.
 */
public class Selector {
    private Command up,down;

    public Selector(Command up, Command down) {
        this.up = up;
        this.down = down;
    }
    public void switchOn(){
        up.run();
    }
    public void switchOff(){
        down.run();
    }
}
