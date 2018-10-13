package SecondTry.Source_Code.OOD.Lessons4_Builder.Second;

/**
 * Created by user on 12.10.2018.
 */
public class Run {
    public static void main(String[] args) {
        Client client=new Client();
        Choice choice=new Pizza();
        client.setChoice(choice);
        client.buildPizza();
        Query query=client.acceptQuery();

    }
}
