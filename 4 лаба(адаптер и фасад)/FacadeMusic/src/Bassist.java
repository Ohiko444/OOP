public class Bassist extends Musician{

    public Bassist(String name) {
        super(name);
    }

    public void followTheDrums(){
        super.write();
        System.out.println("следует за барабанами. ");
    }

    public void changeRhythm(String type){
        super.write();
        System.out.println("перешёл на ритм " + type + "а.");
    }

    public void stopPlaying(){
        super.write();
        System.out.println("заканчивает играть. ");
    }
}
