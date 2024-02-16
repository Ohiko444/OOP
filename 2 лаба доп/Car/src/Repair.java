public class Repair extends Addservices{
    Cardealership cardealership;

    public Repair(Cardealership cardealership){
        this.cardealership = cardealership;
    }

    public String getDescription() {
        return cardealership.getDescription() + "\nремонт";
    }

    public double cost(){
        return cardealership.cost() + 25000;
    }
}
