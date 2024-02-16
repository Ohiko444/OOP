package Developer;

public class ProgrammerColleague extends Colleague{

    public ProgrammerColleague(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Сообщение программисту: " + message);
    }

}