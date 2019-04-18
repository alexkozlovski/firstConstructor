package SecondTry.Source_Code.OOD.Lessons14_Mediator.try3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 06.11.2018.
 */
public class ChatMediator extends Mediator {
    private List<User> users;

    public ChatMediator() {
        users=new ArrayList<>();
    }

    @Override
    public void addUser(User currentUser) {
        if(!users.contains(currentUser))users.add(currentUser);
    }

    @Override
    public void sendMessage(User currentUser,String message) {
        for (User user:users){
            if(currentUser!=user)user.receive(message);
        }
    }
}
