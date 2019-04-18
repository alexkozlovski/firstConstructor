package SecondTry.Source_Code.OOD.Lessons15_Memento.try4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.11.2018.
 */
public class Test {
    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();
        originator.setState("state 1");
        System.out.println(originator.getState());
        caretaker.add(originator.save());
        originator.setState("pizduk 2");
        System.out.println(originator.getState());
        originator.load(caretaker.get(0));
        System.out.println(originator.getState());

    }
}
