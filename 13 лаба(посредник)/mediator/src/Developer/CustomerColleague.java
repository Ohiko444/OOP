package Developer;

public class CustomerColleague extends Colleague{

    public CustomerColleague(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Сообщение заказчику: " + message);
    }

}
