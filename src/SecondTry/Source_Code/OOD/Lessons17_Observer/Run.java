package SecondTry.Source_Code.OOD.Lessons17_Observer;

/**
 * Created by user on 15.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Subject subject=new Subject();
        new BinaryObserver(subject);
        new HexadecimalObserver(subject);
        new OctalObserver(subject);
        System.out.println("Frist state:");
        subject.setState(117);
    }
}
