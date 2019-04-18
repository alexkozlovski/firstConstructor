package SecondTry.Source_Code.OOD.Lessons6_Command.MorningTry;

/**
 * Created by user on 02.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Cat cat=new Cat();
        Command on=new SwitchOnCommand(cat);
        Command off=new SwitchOffCommand(cat);
        Selector selector=new Selector(on,off);
        selector.switchOn();
        selector.switchOff();
    }
}
