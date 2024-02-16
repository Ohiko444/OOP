public class Insurance extends Addservices{
    Cardealership cardealership;

    public Insurance(Cardealership cardealership){
        this.cardealership = cardealership;
    }

    public String getDescription() {
        return cardealership.getDescription() + "\nстраховка";
    }

    public double cost(){
        return cardealership.cost() + 40000;
    }
}
