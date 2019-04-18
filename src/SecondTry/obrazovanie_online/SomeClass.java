package SecondTry.obrazovanie_online;

public class SomeClass {
    int age;
    public SomeClass(){

    }
    public SomeClass(int age){
        this.age=age;
    }
    @Override
    public String toString(){

        String s=new String();
        s=" "+this.age;
        return s;

    }


    public static void main(String[] args) {
        SomeClass someClass=new SomeClass();
        SomeClass someClass1=new SomeClass(12);
        System.out.println(someClass1.toString());
        int a=5;
        System.out.println(a++ +2);

        System.out.println(a);
    }
}
