package SecondTry.Source_Code.OOD.Lessons21_State;

public class Water {
    private State state;
    public Water(){
//        state=null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
