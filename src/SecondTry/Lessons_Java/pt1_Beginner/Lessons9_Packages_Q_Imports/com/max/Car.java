package SecondTry.Lessons_Java.pt1_Beginner.Lessons9_Packages_Q_Imports.com.max;

public class Car {
    public int a;
    public int g;
    public String str;

    public Car(int a, int g, String str) {
        this.a = a;
        this.g = g;
        this.str = str;
    }

    public Car(int a, int g) {
        this.a = a;
        this.g = g;
    }
    public boolean isFull(){
        return true;
    }
    public void sayHello(){
        System.out.println("hello");
    }
    public int pow(int a,int b){
        return (int)Math.pow(a,b);
    }
}
