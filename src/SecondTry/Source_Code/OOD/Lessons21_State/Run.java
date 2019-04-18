package SecondTry.Source_Code.OOD.Lessons21_State;

public class Run {
    public static void main(String[] args) {
        Water water=new Water();

        State solid=new SolidState();
        solid.changeState(water);
        System.out.println(water.getState());

        State liquid=new LiquidState();
        liquid.changeState(water);
        System.out.println(water.getState());

        State gaseous=new GaseousState();
        gaseous.changeState(water);
        System.out.println(water.getState());

    }
}
