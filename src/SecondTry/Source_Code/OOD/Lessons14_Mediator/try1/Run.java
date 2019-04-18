package SecondTry.Source_Code.OOD.Lessons14_Mediator.try1;

/**
 * Created by user on 05.11.2018.
 */
public class Run {
    public static void main(String[] args) {
        Mediator mediator=new ChatMediator();
        User alex=new ChatParticipant(mediator,"Alex Kozlovsky");
        User petr=new ChatParticipant(mediator,"Petr Petrov");
          mediator.addUser(alex);
        mediator.addUser(petr);
        alex.send("hihi my name is "+alex.getNickname());

    }
}
