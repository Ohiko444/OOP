package pizza2;

public class NYStyleVeggiePizza  extends Pizza{
    public NYStyleVeggiePizza(){
        name = "Вегетарианская пицца по-Нью-Йоркски";
        dough = "Тесто с тонкой корочкой";
        sauce = "Соус Маринара";

        toppings.add("Реджано");
        toppings.add("Грибы");
        toppings.add("Лук");
        toppings.add("Красный перец");
    }
}