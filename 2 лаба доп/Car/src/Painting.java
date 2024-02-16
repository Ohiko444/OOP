public class Painting extends Addservices{
    Cardealership cardealership;

    public Painting(Cardealership cardealership){
        this.cardealership = cardealership;
    }

    public String getDescription() {
        return cardealership.getDescription() + "\nпокраска";
    }

    public double cost(){
        return cardealership.cost() + 75000;
    }
}
