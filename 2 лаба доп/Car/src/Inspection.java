public class Inspection extends Addservices{
    Cardealership cardealership;

    public Inspection(Cardealership cardealership){
        this.cardealership = cardealership;
    }

    public String getDescription() {
        return cardealership.getDescription() + "\nтехосмотр";
    }

    public double cost(){
        return cardealership.cost() + 30000;
    }
}
