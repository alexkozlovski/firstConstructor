package SecondTry.Source_Code.OOD.Lessons14_Mediator.try1;

/**
 * Created by user on 05.11.2018.
 */
public class ChatParticipant extends User {

    public ChatParticipant(Mediator mediator, String nickname) {
        super(mediator, nickname);
    }

    @Override
    public void send(String message) {
        System.out.printf("%s send message: %s %n",this.getNickname(),message);
        getMediator().sendMessage(this,message);
    }

    @Override
    public void recieve(String message) {

        System.out.printf("%s receive message: %s %n",this.getNickname(),message);
    }
}
