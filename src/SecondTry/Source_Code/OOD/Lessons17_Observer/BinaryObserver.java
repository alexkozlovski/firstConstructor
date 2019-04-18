package SecondTry.Source_Code.OOD.Lessons17_Observer;

/**
 * Created by user on 15.11.2018.
 */
public class BinaryObserver  extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary: "+Integer.toBinaryString(subject.getState()));
    }
}
