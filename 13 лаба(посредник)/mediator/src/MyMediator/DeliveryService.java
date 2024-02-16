package MyMediator;

public class DeliveryService extends People {

    public DeliveryService(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Сообщение сервису доставки: " + message);
    }

}