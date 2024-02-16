package chat2;

public abstract class User {

    protected Mediator mediator;
    protected String name;

    public User(Mediator med, String name){
        this.mediator=med;
        this.name=name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

}
