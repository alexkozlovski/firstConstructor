package SecondTry.Source_Code.OOD.Lessons15_Memento.try3;

/**
 * Created by user on 14.11.2018.
 */
public class Worker extends Originator{
    private String status;
    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status=status;
    }

    @Override
    public Memento save(String state) {
        return super.save(state);
    }

    @Override
    public void load(Memento memento) {
        status=memento.getState();
    }
}
