public class Max extends Equiment{
    Cardealership cardealership;

    public Max(Cardealership cardealership){
        this.cardealership = cardealership;
    }

    public String getDescription() {
        return cardealership.getDescription() + "в максимальной комплектации.\nДополнительные услуги:";
    }

    public double cost(){
        return cardealership.cost();
    }
}
