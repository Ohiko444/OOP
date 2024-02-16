import java.util.Scanner;

public class Fisher {
    private String name;
    private int fishes;
    private Fishingable fishingStrategy;
    Scanner inp = new Scanner(System.in);
    Fisher(){}

    public Fisher(Fishingable fishingStrategy){
        this.fishingStrategy = fishingStrategy;
    }

    public void setFishes(int fishes) {
        this.fishes = fishes;
    }

    public void read(){
        System.out.print("Введите имя рыбака: ");
        this.name = inp.nextLine();
    }

    public int goFishing(){
        fishes += fishingStrategy.fishing();
        return fishes;
    }

    public void write(){
        System.out.println(name + " поймал рыб " + fishes);
    }

    public void setFishingStrategy(Fishingable fishingStrategy) {
        this.fishingStrategy = fishingStrategy;
    }
}
