public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", " + beverage.getSize() + " Milk";
    }

    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Beverage.Size.TALL){
            cost += .05;
        } else if (beverage.getSize() == Beverage.Size.GRANDE){
            cost += .10;
        } else if (beverage.getSize() == Beverage.Size.VENTI){
            cost += .15;
        }
        return cost;
    }
}
