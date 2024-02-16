public class Vocalist extends Musician{

    public Vocalist(String name) {
        super(name);
    }

    public void singCouplet(int coupletNumber){
        super.write();
        System.out.println("спел куплет номер. " + coupletNumber);
    }

    public void singChorus(){
        super.write();
        System.out.println("спел куплет.");
    }
}
