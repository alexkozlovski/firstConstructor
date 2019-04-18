package SecondTry.Source_Code.OOD.Lessons14_Mediator.try1;

/**
 * Created by user on 05.11.2018.
 */
public abstract class  User {
    private Mediator mediator;
    private String nickname;

    public Mediator getMediator() {
        return mediator;
    }

    public String getNickname() {
        return nickname;
    }

    public User(Mediator mediator, String nickname) {
        this.mediator = mediator;
        this.nickname = nickname;
    }

    public abstract void send(String message);
    public abstract void recieve(String message);
}
