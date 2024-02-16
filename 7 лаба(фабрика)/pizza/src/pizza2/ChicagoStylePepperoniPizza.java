package pizza2;

public class ChicagoStylePepperoniPizza  extends Pizza{
    public ChicagoStylePepperoniPizza(){
        name = "Пеперони по-чикагски";
        dough = "Тесто с толстой корочкой";
        sauce = "Томатный соус";

        toppings.add("Моцарелла");
        toppings.add("Пармезан");
        toppings.add("Баклажан");
        toppings.add("Шпинат");
        toppings.add("Оливки");
        toppings.add("Пеперони");
    }

    void cut(){
        System.out.println("Нарезание пиццы квадратными ломтиками");
    }
}