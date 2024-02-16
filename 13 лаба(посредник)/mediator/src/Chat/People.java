package Chat;

public abstract class People {

    protected Mediator mediator;

    public People(Mediator mediator){
        this.mediator = mediator;
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public abstract void notify(String message);

    public abstract void write(String message);

}
