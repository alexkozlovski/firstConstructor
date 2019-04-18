package SecondTry.Source_Code.OOD.Lessons17_Observer.try1_nagit;

/**
 * Created by user on 15.11.2018.
 */
public class HexadecimalObserver extends Observer{
    private Number number;
    public HexadecimalObserver(Number number) {
        this.number=number;
        this.number.attachObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Hexadecimal: "+Integer.toHexString(number.getInt()));
    }
}
