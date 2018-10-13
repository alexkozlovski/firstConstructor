package SecondTry.Source_Code.OOD.Lessons6_Command.tryIt_naGit;

/**
 * Created by user on 13.10.2018.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Cat cat=new Cat();
        Command appear=new AppearCommand(cat);
        Command hide=new HideCommand(cat);
        Selector selector=new Selector(appear,hide);

        while (true){
            selector.appear();
            Thread.sleep(1000);
            selector.hide();
            Thread.sleep(1000);
        }
    }
}
