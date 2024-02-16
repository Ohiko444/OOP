//родительский класс декоратора
public abstract class CondimentDecorator extends Beverage{
    public Beverage beverage;
    public abstract String getDescription();

}
