public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", " + beverage.getSize() + " Whip";
    }

    public double cost(){
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL){
            cost += .05;
        } else if (beverage.getSize() == Size.GRANDE){
            cost += .10;
        } else if (beverage.getSize() == Size.VENTI){
            cost += .15;
        }
        return cost;
    }
}
