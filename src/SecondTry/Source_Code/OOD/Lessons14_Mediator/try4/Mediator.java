package SecondTry.Source_Code.OOD.Lessons14_Mediator.try4;

/**
 * Created by user on 06.11.2018.
 */
public interface Mediator {
    void addUser(User user);
    void sendMessage(User currentUser,String message);
}
