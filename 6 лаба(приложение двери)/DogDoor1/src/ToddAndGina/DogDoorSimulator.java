package ToddAndGina;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remove remove = new Remove(door);

        System.out.println("Фидо лает, чтобы выйти на улицу...");
        remove.pressButton();

        System.out.println("\nФидо вышел на улицу...");
        System.out.println("Фидо закончил...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){}

        System.out.println("\n...Фидо гонялся за жуками и застрял снаружи");
        System.out.println("Фидо начинает лаять...");
        System.out.println("...Джина хватает пульт дистанционного управления");
        remove.pressButton();
        System.out.println("Фидо вернулся внутрь...");
    }
}
