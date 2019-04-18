package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod;

/**
 * Created by user on 02.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Client client=new Client();
        Choice choice=new Pizza();
        client.setChoice(choice);
        client.buildPizza("XL","barbecue","mushrooms, bacon");
        Query query=client.acceptQuery();
    }
}
