public class Average extends Equiment{
    Cardealership cardealership;

    public Average(Cardealership cardealership){
        this.cardealership = cardealership;
    }

    public String getDescription() {
        return cardealership.getDescription() + "в средней комплектации.\nДополнительные услуги:";
    }

    public double cost(){
        return cardealership.cost() + 300000;
    }
}
