package ToddAndGina_2_0;

public class Remove implements WhoOpenClose{
    private DogDoor door;

    public Remove(DogDoor door){
        this.door = door;
    }

    public void openClose(String bark){
        System.out.println("Нажатие кнопки дистанционного управления...");
        if(door.isOpen()){
            door.close();
        } else{
            door.open();
        }
    }
}
