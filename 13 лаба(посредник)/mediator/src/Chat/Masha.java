package Chat;

public class Masha extends People {

    public Masha(Mediator mediator){
        super(mediator);
    }

    public void write(String massage){
        System.out.println("Маша отправляет сообщение: " + massage);
    }

    public void notify(String message) {
        System.out.println("Маша получает сообщение: " + message);
    }

}