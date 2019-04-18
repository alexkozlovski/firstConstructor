package SecondTry.obrazovanie_online.Lessons15;

public class RelizedIntr implements Intr{
    @Override
    public void set() {
        System.out.println("set methode in relizedintr");
    }

    @Override
    public void f() {
        System.out.println("this class relizedIntr");

    }

    @Override
    public int methode(int d) {
        return (int)Math.pow(d,2);
    }
}
