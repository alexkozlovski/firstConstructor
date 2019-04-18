package SecondTry.Source_Code.OOD.Lessons21_State;

public class SolidState implements State {
    @Override
    public void changeState(Water water) {
        System.out.println("Water in the solid state");
        water.setState(this);
    }

    @Override
    public String toString() {
        return "it can be ice";
    }
}
