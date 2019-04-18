package SecondTry.Source_Code.OOD.Lessons17_Observer.try1_nagit;

/**
 * Created by user on 15.11.2018.
 */
public class BinaryObserver extends Observer {
    private Number number;

    public BinaryObserver(Number number) {
        this.number = number;
        this.number.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Binary: "+Integer.toBinaryString(number.getInt()));
    }
}
