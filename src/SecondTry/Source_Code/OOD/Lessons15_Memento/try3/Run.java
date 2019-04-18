package SecondTry.Source_Code.OOD.Lessons15_Memento.try3;

/**
 * Created by user on 14.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Originator alex=new Worker();
        Caretaker caretaker=new Caretaker();
        alex.setStatus("Junior");
        caretaker.add(alex.save(alex.getStatus()));
        System.out.println(alex.getStatus());
        alex.setStatus("pizduk");
        System.out.println(alex.getStatus());
        alex.load(caretaker.get(0));
        System.out.println(alex.getStatus());

    }
}
