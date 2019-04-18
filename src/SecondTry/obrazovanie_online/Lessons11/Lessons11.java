package SecondTry.obrazovanie_online.Lessons11;

public class Lessons11 {
    public static void main(String[] args) {
        System.out.println("start with "+InstanceCounter.getCount()+" exemplar");
        for (int i = 0; i <500 ; i++) {
            new InstanceCounter();
        }
        System.out.println("created "+InstanceCounter.getCount()+" exemplars");
    }
}
