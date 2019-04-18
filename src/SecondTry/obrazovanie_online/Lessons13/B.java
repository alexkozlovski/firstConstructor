package SecondTry.obrazovanie_online.Lessons13;

public class B extends A{
    public B(int d){
        super(d);
    }
    @Override
    public  void Output(){
        System.out.println("Class B");
        super.Output();
    }
    public void helobitch(){
        System.out.println("helobitch");
    }
    public int powl(){
        return getd()+getd();
    }
}
