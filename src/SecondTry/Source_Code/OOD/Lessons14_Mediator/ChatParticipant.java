package SecondTry.Source_Code.OOD.Lessons14_Mediator;

public class ChatParticipant extends User {
    public ChatParticipant(Mediator mediator, String nickname) {
        super(mediator, nickname);
    }
    @Override
    public void send(String message) {
        System.out.printf("%s write message: %s %n",this.nickname,message);
        mediator.sendMessage(this,message);
    }
    @Override
    public void receive(String message) {
        System.out.printf("%s receive message: %s %n",this.nickname,message);
    }
}