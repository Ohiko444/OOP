package MyMediator;

public class FloralSalon extends People {

    public FloralSalon(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Сообщение флористическому салону: " + message);
    }

}