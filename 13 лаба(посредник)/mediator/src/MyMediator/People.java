package MyMediator;

public abstract class People {

    public Mediator mediator;

    public People(Mediator mediator){
        this.mediator = mediator;
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public abstract void notify(String message);

}

/*
заказчик
служба доставки
доставщик
флористический салон
доставщик
заказчик
 */
