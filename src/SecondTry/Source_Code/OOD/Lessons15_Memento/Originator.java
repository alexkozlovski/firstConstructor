package SecondTry.Source_Code.OOD.Lessons15_Memento;

/**
 * Created by user on 09.11.2018.
 */
public class Originator {
    private String state;
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
