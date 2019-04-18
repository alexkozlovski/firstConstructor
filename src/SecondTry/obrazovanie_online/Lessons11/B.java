package SecondTry.obrazovanie_online.Lessons11;

public class B {
    private static int a=0;
    public static int getA(){
        a++;
        return a;
    }

    public static void main(String[] args) {
        B b=new B();
        b.getA();
        b.getA();
        System.out.println(B.getA());




    }
}
