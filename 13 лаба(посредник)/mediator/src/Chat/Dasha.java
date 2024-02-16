package Chat;

public class Dasha extends People {

    public Dasha(Mediator mediator){
        super(mediator);
    }

    public void notify(String message) {
        System.out.println("Даша получает сообщение: " + message);
    }

    public void write(String massage){
        System.out.println("Даша отправляет сообщение: " + massage);
    }

}
