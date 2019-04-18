package SecondTry.Source_Code.OOD.Lessons14_Mediator.try2;

import java.util.List;

/**
 * Created by user on 05.11.2018.
 */
public class ChatParticipant extends User {
    public ChatParticipant(Mediator mediator, String nickname) {
        super(mediator, nickname);
    }

    @Override
    public void send(String message) {
        System.out.printf("%s write a message: %s %n",this.getNickname(),message);
        this.getMediator().sendMessage(this,message);
    }

    @Override
    public void receive(String message) {
        System.out.printf("%s receive a massage: %s %n",this.getNickname(),message);
    }
}
