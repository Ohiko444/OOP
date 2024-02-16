package Developer;

public class TechnicalWriterColleague extends Colleague{

    public TechnicalWriterColleague(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Сообщение техническму писателю: " + message);
    }

}
