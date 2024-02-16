package ToddAndGina;

public class DogDoor {

    private boolean open;

    public DogDoor(){
        this.open = false;
    }

    public void open(){
        System.out.println("Дверь для собак открыта.");
        open = true;
    }

    public void close(){
        System.out.println("Дверь для собак закрыта.");
        open = false;
    }

    public boolean isOpen(){
        return open;
    }
}
