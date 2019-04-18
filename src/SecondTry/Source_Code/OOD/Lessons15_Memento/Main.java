package SecondTry.Source_Code.OOD.Lessons15_Memento;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by user on 09.11.2018.
 */
public class Main {
    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();

        originator.setState("State 1");

        originator.setState("State 2");
        caretaker.add(originator.save());
        originator.setState("State 3");
        caretaker.add(originator.save());
        originator.setState("State 4");
        System.out.printf("Current state: %s %n",originator.getState());

        originator.load(caretaker.get(0));
        System.out.printf("First saving state: %s %n",originator.getState());

        originator.load(caretaker.get(1));
        System.out.printf("Second saving state: %s %n",originator.getState());
    }
}
