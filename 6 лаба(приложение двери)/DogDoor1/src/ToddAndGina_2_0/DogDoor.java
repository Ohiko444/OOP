package ToddAndGina_2_0;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

    private boolean open;
    private int time;

    public DogDoor(int time){
        this.open = false;
        this.time = time;
    }

    public void open(){
        System.out.println("Дверь для собак открыта.");
        open = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run(){
                close();
                timer.cancel();
            }
        }, time);
    }

    public void close(){
        System.out.println("Дверь для собак закрыта.");
        open = false;
    }

    public boolean isOpen(){
        return open;
    }
}
