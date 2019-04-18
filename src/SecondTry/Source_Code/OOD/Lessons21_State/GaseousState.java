package SecondTry.Source_Code.OOD.Lessons21_State;

public class GaseousState implements State {
    @Override
    public void changeState(Water water) {
        System.out.println("water in the gaseous state");
        water.setState(this);
    }

    @Override
    public String toString() {
        return "it can be steam";
    }
}
