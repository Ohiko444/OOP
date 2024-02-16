package MyMediator;

public class Customer extends People {

    public Customer(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Сообщение заказчику: " + message);
    }

}