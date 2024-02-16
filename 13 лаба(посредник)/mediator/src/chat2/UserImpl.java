package chat2;

public class UserImpl extends User {

    public UserImpl(Mediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg){
        System.out.println(this.name+" отправил сообщение: "+msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println(this.name+" получил сообщение: "+msg);
    }

}