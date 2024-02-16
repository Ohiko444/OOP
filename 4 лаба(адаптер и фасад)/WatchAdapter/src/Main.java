import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        int hour = rnd.nextInt(0, 720);
        int minutes = rnd.nextInt(0, 360);
        int seconds = rnd.nextInt(0, 360);

        AnalogWatch analogWatch1 = new AnalogWatch(hour, minutes, seconds);
        analogWatch1.display();

        System.out.println();

        Watch adapterAnalogWatch = new WatchAdapter(new AnalogWatch(hour, minutes, seconds));
        adapterAnalogWatch.display();

        System.out.println();




        DigitalWatch digitalWatch = new DigitalWatch(adapterAnalogWatch.getHour(),adapterAnalogWatch.getMinutes(),adapterAnalogWatch.getSeconds());
        System.out.println();
        digitalWatch.display();

    }
}
