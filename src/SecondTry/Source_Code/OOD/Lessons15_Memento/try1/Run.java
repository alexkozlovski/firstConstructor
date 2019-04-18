package SecondTry.Source_Code.OOD.Lessons15_Memento.try1;

public class Run {
    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();
        originator.setState("State 1");

        originator.setState("state 2");
        caretaker.add(originator.save());

        originator.setState("state 3");
        caretaker.add(originator.save());
        originator.setState("state 4");
        System.out.println(originator.getState());

        originator.load(caretaker.get(0));
        System.out.println("test1 saving state: "+originator.getState());

        originator.load(caretaker.get(1));
        System.out.println("2nd saving state: "+originator.getState());
    }
}
