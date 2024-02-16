package ToddAndGina;

import java.util.Timer;
import java.util.TimerTask;

public class Remove {
    private DogDoor door;

    public Remove(DogDoor door){
        this.door = door;
    }

    public void pressButton(){
        System.out.println("Нажатие кнопки дистанционного управления...");
        if(door.isOpen()){
            door.close();
        } else{
            door.open();

            final Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run(){
                    door.close();
                    timer.cancel();
                }
            }, 4000);
        }
    }
}
