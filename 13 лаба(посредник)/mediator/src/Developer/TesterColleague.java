package Developer;

public class TesterColleague extends Colleague{

    public TesterColleague(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Сообщение тестеру: " + message);
    }

}