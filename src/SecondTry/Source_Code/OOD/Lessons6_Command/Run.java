package SecondTry.Source_Code.OOD.Lessons6_Command;

/**
 * Created by user on 13.10.2018.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Cat cat=new Cat();
        Command up=new SwitchOnCommand(cat);
        Command down=new SwitchOffCommand(cat);

        Selector selector=new Selector(up,down);
        while (true){
            Thread.sleep(1000);
            selector.switchOn();
            Thread.sleep(1000);
            selector.switchOff();
        }


    }
}
