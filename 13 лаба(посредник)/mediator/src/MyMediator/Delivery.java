package MyMediator;

public class Delivery extends People {

    public Delivery(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Сообщение доставщику: " + message);
    }

}