package SecondTry.Source_Code.OOD.Lessons14_Mediator.try1;

/**
 * Created by user on 05.11.2018.
 */
public interface Mediator {
    void addUser(User user);
    void sendMessage(User CurrentUser,String message);
}
