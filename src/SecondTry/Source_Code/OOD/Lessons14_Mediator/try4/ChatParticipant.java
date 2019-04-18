package SecondTry.Source_Code.OOD.Lessons14_Mediator.try4;

/**
 * Created by user on 06.11.2018.
 */
public class ChatParticipant extends User {
    public ChatParticipant(String nickname, Mediator mediator) {
        super(nickname, mediator);
        mediator.addUser(this);
    }

    @Override
    public void send(String message) {
        System.out.printf("%s write a message: %s %n",this.getNickname(),message);
        this.getMediator().sendMessage(this,message);
    }

    @Override
    public void receive(String message) {
        System.out.printf("%s receive a message: %s %n",this.getNickname(),message);
    }
}
