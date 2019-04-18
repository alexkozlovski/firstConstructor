package SecondTry.Source_Code.OOD.Lessons4_Builder.MorningTry.SomeMethod2;

/**
 * Created by user on 02.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Choice choice=new Car();
        Client client=new Client(choice);
        client.buildCar("BMW X5M","BLUE","JEEP",250);
        Query query=client.acceptQuery();
        System.out.println(query.getInfo());
        System.out.println(client.getOrderDetails());
    }
}
