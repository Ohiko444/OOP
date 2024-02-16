package ToddAndGina_2_0;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MyDogDoorSimulator {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Введите таймер закрывания двери в милисекундах: ");
        int time = inp.nextInt();

        DogDoor door = new DogDoor(time);


        List<WhoOpenClose> openCloseDoor = Arrays.asList(new Remove(door), new BarkRecognizer(door));

        System.out.println("Фидо начинает лаять.\n");
        openCloseDoor.get(ThreadLocalRandom.current().nextInt(openCloseDoor.size())).openClose("Гав-гав");

        System.out.println("\nФидо вышел на улицу...");
        System.out.println("Фидо закончил...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){}

        System.out.println("\n...Фидо гонялся за жуками и застрял снаружи");

        System.out.println("Фидо начинает лаять.\n");
        openCloseDoor.get(ThreadLocalRandom.current().nextInt(openCloseDoor.size())).openClose("Гав-гав");

        System.out.println("\nФидо вернулся внутрь...");
    }
}
