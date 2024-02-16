package Chat;

public class Sasha extends People {

    public Sasha(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Саша получает сообщение: " + message);
    }

    public void write(String massage){
        System.out.println("Саша отправляет сообщение: " + massage);
    }

}