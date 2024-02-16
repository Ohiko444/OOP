package ToddAndGina_2_0;

public class BarkRecognizer implements WhoOpenClose{
    private DogDoor door;

    public BarkRecognizer(DogDoor door){
        this.door = door;
    }

    public void openClose(String bark){
        System.out.println("Распознаватель лая: услышал '" + bark + "'");
        door.open();
    }
}
