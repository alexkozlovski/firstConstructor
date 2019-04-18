package SecondTry.Source_Code.OOD.Lessons15_Memento.try1;

/**
 * Created by user on 13.11.2018.
 */
public class Originator {
    private  String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento save(){
        return new Memento(state);
    }
    public void load(Memento memento){
        state=memento.getState();
    }
}
