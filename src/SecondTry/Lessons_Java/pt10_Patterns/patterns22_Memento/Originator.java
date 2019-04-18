package SecondTry.Lessons_Java.pt10_Patterns.patterns22_Memento;

/**
 * Created by user on 13.11.2018.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    Memento createMemento(){
        return new Memento(state);
    }
    void getDataFromMemento(Memento memento){
        this.state=memento.getState();
    }
}
