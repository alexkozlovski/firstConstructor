package SecondTry.Source_Code.OOD.Lessons15_Memento.try1;

import java.io.Serializable;

/**
 * Created by user on 09.11.2018.
 */
public class Memento implements Serializable{
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
