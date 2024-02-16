package chat2;

import java.util.ArrayList;
import java.util.List;

public class UsersMediator implements Mediator {

    private List<User> users;

    public UsersMediator(){
        this.users=new ArrayList<>();
    }

    @Override
    public void addUser(User user){
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for(User u: this.users){
            if (u != user) {
                u.receive(msg);
            }
        }
    }

}