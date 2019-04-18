package SecondTry.Source_Code.OOD.Lessons14_Mediator.try3;

/**
 * Created by user on 09.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Mediator mediator=new ChatMediator();
        User user1=new ChatParticipant("Administrator",mediator);
        User user2=new ChatParticipant("Common user",mediator);
        mediator.addUser(user1);
        mediator.addUser(user2);
        user1.send("ProtectionProxy");
    }
}
