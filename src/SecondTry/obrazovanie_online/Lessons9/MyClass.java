package SecondTry.obrazovanie_online.Lessons9;

public class MyClass {
    private int a;
    public MyClass(int a){
        this.a=a;
    }
    public int pow(){
        return a*a;
    }
    public int powl(int a,int n){
        int res=(int)Math.pow(a,n);
        return res;
    }
}
