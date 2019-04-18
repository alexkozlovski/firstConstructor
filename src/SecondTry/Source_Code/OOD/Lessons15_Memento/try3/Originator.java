package SecondTry.Source_Code.OOD.Lessons15_Memento.try3;

/**
 * Created by user on 14.11.2018.
 */
public abstract class Originator {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Memento save(String state){
        return new Memento(state);
    }
    public void load(Memento memento){
    this.status=memento.getState();
    }
}
