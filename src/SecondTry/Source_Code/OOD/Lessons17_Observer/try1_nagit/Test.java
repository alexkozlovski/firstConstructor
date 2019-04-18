package SecondTry.Source_Code.OOD.Lessons17_Observer.try1_nagit;

/**
 * Created by user on 15.11.2018.
 */
public class Test {
    private static  int state=0;
    public static void main(String[] args) {
        Number number=new Number();
        new OctalObserver(number);
        new HexadecimalObserver(number);
        new BinaryObserver(number);
        start(117,number);
        start(217,number);

    }
    public static void start(int i,Number number){
        System.out.printf(++state+" state:[%d]%n",i);
        number.setNumber(i);
        System.out.println("");

    }
}
