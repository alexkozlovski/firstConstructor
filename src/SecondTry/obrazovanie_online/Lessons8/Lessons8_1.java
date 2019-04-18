package SecondTry.obrazovanie_online.Lessons8;

public class Lessons8_1 {
    int a;
    int b;
    public  int pow(int a){
        return a*a;
    }
    public int pow(int a,int b){
        return a*b;
    }

    Lessons8_1(int a){

    }
    Lessons8_1(int a, int b){
        this.a=a;
        this.b=b;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
     //   System.out.println(pow(10));
        Lessons8_1 lessons8_1=new Lessons8_1(10);
        Lessons8_1 lessons8_2=new Lessons8_1(10,3);
        System.out.println(lessons8_1.pow(10));
        System.out.println(lessons8_2.pow(lessons8_2.getA(),lessons8_2.getB()));

    }
}
