package SecondTry.Source_Code.OOD.Lessons17_Observer;

/**
 * Created by user on 15.11.2018.
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Octal: "+Integer.toOctalString(subject.getState()));
    }
}
