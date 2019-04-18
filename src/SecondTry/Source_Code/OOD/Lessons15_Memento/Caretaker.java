package SecondTry.Source_Code.OOD.Lessons15_Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 09.11.2018.
 */
public class Caretaker {
    private List<Memento> list=new ArrayList<>();
    public void add(Memento memento){
        list.add(memento);
    }
    public Memento get(int index){
        return list.get(index);
    }
}
