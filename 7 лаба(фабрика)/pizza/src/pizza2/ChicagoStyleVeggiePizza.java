package pizza2;

public class ChicagoStyleVeggiePizza  extends Pizza{
    public ChicagoStyleVeggiePizza(){
        name = "Вегетарианская пиццапо-чикагски";
        dough = "Тесто с толстой корочкой";
        sauce = "Томатный соус";

        toppings.add("Моцарелла");
        toppings.add("Пармезан");
        toppings.add("Баклажан");
        toppings.add("Шпинат");
        toppings.add("Оливки");
    }

    void cut(){
        System.out.println("Нарезание пиццы квадратными ломтиками");
    }
}