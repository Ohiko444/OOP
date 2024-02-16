public class Guitarist extends Musician{

    public Guitarist(String name) {
        super(name);
    }

    public void playCoolOpening(){
        super.write();
        System.out.println("начинает с крутого вступления. ");
    }

    public void playCoolRiffs(){
        super.write();
        System.out.println("играет крутые риффы. ");
    }

    public void playAnotherCoolRiffs(){
        super.write();
        System.out.println("играет другие крутые риффы.");
    }

    public void playIncrediblyCoolSolo(){
        super.write();
        System.out.println("выдает невероятно крутое соло.");
    }

    public void playFinalAccord(){
        super.write();
        System.out.println("заканчивает песню мощным аккордом.");
    }
}
