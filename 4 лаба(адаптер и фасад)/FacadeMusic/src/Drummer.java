public class Drummer extends Musician{

    public Drummer(String name) {
        super(name);
    }

    public void startPlaying(){
        super.write();
        System.out.println("начинает играть.");
    }

    public void stopPlaying(){
        super.write();
        System.out.println("заканчивает играть.");
    }
}
