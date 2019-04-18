package SecondTry.Source_Code.OOD.Lessons14_Mediator.try1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 05.11.2018.
 */
public class ChatMediator implements Mediator {
    List<User> users;

    public ChatMediator() {
        users=new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(User currentUser,String message) {
        currentUser.send(message);
        for (User user:this.users){
            if (user!=currentUser)user.recieve(message);
        }
    }
}
