package SecondTry.Source_Code.OOD.Lessons14_Mediator.try2;

/**
 * Created by user on 05.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Mediator mediator=new ChatMediator();
        User admin=new ChatParticipant(mediator,"Administrator");
        User user=new ChatParticipant(mediator,"User");
        User user2=new ChatParticipant(mediator,"User2");
        mediator.addUser(admin);
        mediator.addUser(user);
        mediator.addUser(user);
        mediator.addUser(user2);
        admin.send("HI!) my name is Alex.");
        user.send("oh, admin... can u check my keyboard?");
    }
}
