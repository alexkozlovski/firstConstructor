package SecondTry.obrazovanie_online.Lessons13.blinding;

public class Cat extends Dog{

    public Cat(int size) {
        super(size);
    }

    @Override
    public String Say(String type, String name) {
        System.out.println("from cat class");
        return super.Say(type, name);
    }

    public String Say(){
        return "Cat bleat";
    }
}
