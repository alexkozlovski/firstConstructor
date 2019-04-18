package SecondTry.Source_Code.OOD.Lessons14_Mediator.try2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 05.11.2018.
 */
public class ChatMediator implements Mediator {
    private List<User> users;
    public ChatMediator() {
        users=new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        if(!users.contains(user))users.add(user);
    }

    @Override
    public void sendMessage(User currentUser, String message) {
        for (User user:users){
            if(user!=currentUser)user.receive(message);
        }
        System.out.println("");
    }
}
