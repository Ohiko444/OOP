package pizza2;

public class NYPizzaFactory extends PizzaStore{

    public Pizza createPizza(String type) {

        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            case "clam" -> new NYStyleClamPizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> null;
        };

    }
}
