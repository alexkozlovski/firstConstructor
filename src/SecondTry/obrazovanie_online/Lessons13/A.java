package SecondTry.obrazovanie_online.Lessons13;

public class A {
    private int d;
    protected int getd(){
        return d;
    }
    public A(int d){
        this.d=d;
    }
    public int pow(){
        return d*d;
    }
    public void Output(){
        System.out.println("Class A");
    }

    public void Output(String s){
        System.out.println("Class A "+s);
    }
    public void helo(){
        System.out.println("helobitches");
    }

}
