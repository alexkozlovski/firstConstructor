package SecondTry.obrazovanie_online.Lessons13.blinding;

public class Dog {
    protected int size;
    public Dog(int size){
        this.size=size;
    }



    public  String Say(String type, String name){
        System.out.println("from dog class");
        return type+" "+name;
    }
}
