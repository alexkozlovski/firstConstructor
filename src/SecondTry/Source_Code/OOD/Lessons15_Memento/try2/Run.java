package SecondTry.Source_Code.OOD.Lessons15_Memento.try2;

/**
 * Created by user on 13.11.2018.
 */
public class Run {
    public static void main(String[] args){
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();
        for (int i = 0; i <10 ;i++ ) {
            originator.setState("state: "+i);
            caretaker.add(originator.save());

        }
        for (int i = 0; i <10 ; i++) {
            originator.load(caretaker.get(i));
            System.out.println("current state: "+originator.getState());
        }



    }

}
