public class Base extends Equiment{
    Cardealership cardealership;

    public Base(Cardealership cardealership){
        this.cardealership = cardealership;
    }

    public String getDescription() {
        return cardealership.getDescription() + "в базовой комплектации.\nДополнительные услуги:";
    }

    public double cost(){
        return cardealership.cost();
    }
}
