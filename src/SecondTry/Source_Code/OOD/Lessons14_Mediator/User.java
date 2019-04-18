package SecondTry.Source_Code.OOD.Lessons14_Mediator;

/**
 * Created by user on 05.11.2018.
 */
public abstract class User {
    protected Mediator mediator;
    protected String nickname;

    public User(Mediator mediator, String nickname) {
        this.mediator = mediator;
        this.nickname = nickname;
    }
    public abstract void send(String message);
    public abstract void receive(String message);
}
