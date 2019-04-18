package SecondTry.Source_Code.OOD.Lessons14_Mediator;

/**
 * Created by user on 05.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Mediator mediator=new ChatMediator();
        User admin=new ChatParticipant(mediator,"Administrator");
        User user=new ChatParticipant(mediator,"User");
        mediator.addUser(admin);
        mediator.addUser(user);
        admin.send("HeY!)");
    }
}
