package SecondTry.Source_Code.OOD.Lessons14_Mediator.try4;

/**
 * Created by user on 06.11.2018.
 */
public abstract class User {
    private String nickname;
    private Mediator mediator;

    public User(String nickname, Mediator mediator) {
        this.nickname = nickname;
        this.mediator = mediator;
    }

    public String getNickname() {
        return nickname;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
