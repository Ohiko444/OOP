//реализация декоратора
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", " + beverage.getSize() + " Mocha";
    }

    public double cost(){
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL){
            cost += .15;
        } else if (beverage.getSize() == Size.GRANDE){
            cost += .20;
        } else if (beverage.getSize() == Size.VENTI){
            cost += .25;
        }
        return cost;
    }
}
