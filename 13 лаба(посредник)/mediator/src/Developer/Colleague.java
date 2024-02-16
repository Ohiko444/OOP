package Developer;

public abstract class Colleague {

    public Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public abstract void notify(String message);

}
