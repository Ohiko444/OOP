package pizza2;

public class ChicagoStyleClamPizza  extends Pizza{
    public ChicagoStyleClamPizza(){
        name = "Пицца с мидиями по-чикагски";
        dough = "Тесто с толстой корочкой";
        sauce = "Томатный соус";

        toppings.add("Моцарелла");
        toppings.add("Пармезан");
        toppings.add("Оливки");
    }

    void cut(){
        System.out.println("Нарезание пиццы квадратными ломтиками");
    }
}