package SecondTry.Source_Code.OOD.Lessons6_Command.MorningTry;

/**
 * Created by user on 02.11.2018.
 */
public class Selector {
   private Command up,down;

    public Selector(Command up,Command down) {
        this.up = up;
        this.down=down;
    }
    public void switchOff(){
        down.run();
    }
    public void switchOn(){

        up.run();
    }
}
