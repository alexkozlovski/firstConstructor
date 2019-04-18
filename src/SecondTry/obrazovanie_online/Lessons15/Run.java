package SecondTry.obrazovanie_online.Lessons15;

public class Run {
    public static void main(String[] args) {
        Intr ob1=new RelizedIntr();
/*        Intr intr=new Intr() {
            @Override
            public void f() {
                System.out.println("intr ");
            }

            @Override
            public int methode(int d) {
                return d*d;
            }
        };*/
            Intr2 in1=new RelizedIntr();
            Intr2 in2=new real2();
        System.out.println(ob1.methode(9));
        System.out.println(new RelizedIntr().methode(20));
        ob1.f();
        in1.set();
        in2.set();

    }
}
