package ToddAndGina_2_0;

import java.util.Scanner;

public class DogDoorSimulator {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Введите таймер закрывания двери в милисекундах: ");
        int time = inp.nextInt();

        DogDoor door = new DogDoor(time);
        BarkRecognizer recognizer = new BarkRecognizer(door);
        Remove remove = new Remove(door);

        //имитация лая для распознавателя
        System.out.println("Фидо начинает лаять.");
        recognizer.openClose("Гав-гав");

        System.out.println("\nФидо вышел на улицу...");
        System.out.println("Фидо закончил...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){}

        System.out.println("\n...Фидо гонялся за жуками и застрял снаружи");

        //имитация повторного лая
        System.out.println("Фидо начинает лаять...\n");
        recognizer.openClose("Гав-гав");
        System.out.println("\nФидо вернулся внутрь...");
    }
}
