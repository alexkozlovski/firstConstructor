package SecondTry.Lessons_Java.pt10_Patterns.patterns22_Memento;


/**
 * Created by user on 13.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("one");
        CareTaker caretaker = new CareTaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("one");
        caretaker.setMemento(originator.createMemento());
        originator.getDataFromMemento(caretaker.getMemento());
        System.out.println(originator.getState());

    }
}
