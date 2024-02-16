package pizza2;

public class CaliforniaPizzaFactory extends PizzaStore{

    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            case "pepperoni" -> new CaliforniaStylePepperoniPizza();
            case "clam" -> new CaliforniaStyleClamPizza();
            case "veggie" -> new CaliforniaStyleVeggiePizza();
            default -> null;
        };
    }
}
