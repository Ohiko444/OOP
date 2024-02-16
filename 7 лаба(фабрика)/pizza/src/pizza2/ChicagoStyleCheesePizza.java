package pizza2;

public class ChicagoStyleCheesePizza  extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Пицца с сыром во фритюре по-чикагски";
        dough = "Тесто с толстой корочкой";
        sauce = "Сливово-томатный соус";

        toppings.add("Моцарелла");
        toppings.add("Пармезан");
        toppings.add("Орегано");
    }

    void cut(){
        System.out.println("Нарезание пиццы квадратными ломтиками");
    }
}