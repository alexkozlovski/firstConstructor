package SecondTry.obrazovanie_online.Lessons19_EXCEPTION_NEPONYAL_GOVNO;

public class A {
    public double pow(double a)throws MyException {
        if (a<=0) throw  new MyException();
        return a*a;
    }
    public void f() throws MyException{
        pow(-3);
    }
}
