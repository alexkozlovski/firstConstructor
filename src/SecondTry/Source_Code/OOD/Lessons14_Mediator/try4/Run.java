package SecondTry.Source_Code.OOD.Lessons14_Mediator.try4;

/**
 * Created by user on 06.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Mediator mediator=new ChatMediator();
        User admin=new ChatParticipant("Administrator",mediator);
        User user=new ChatParticipant("Common User",mediator);
        User user2=new ChatParticipant("Common User2",mediator);
        User user3=new ChatParticipant("Common User3",mediator);

        admin.send("Hi");
        try {
            Thread.sleep(1000);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        user.send("he");
    }
}
