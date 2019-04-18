package SecondTry.Source_Code.OOD.Lessons21_State.try1;

public class User {
    private State state;
    private String name;
    public User(String name) {
        this.name=name;
        state = new UndefinedUser();
    }

    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }
}
