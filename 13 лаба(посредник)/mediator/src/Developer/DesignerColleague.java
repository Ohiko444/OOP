package Developer;

public class DesignerColleague extends Colleague{

    public DesignerColleague(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Сообщение дизайнеру: " + message);
    }

}