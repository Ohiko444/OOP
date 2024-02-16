package pizza2;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare(){
        System.out.println("Готовка " + name);
        System.out.println("Замешивание теста...");
        System.out.println("Добавление соуса...");
        System.out.println("Добавление начинки:");
        for (String topping: toppings){
            System.out.println(" " + topping);
        }
    }

    void bake(){
        System.out.println("Выпекание 25 минут при температуре 350");
    }

    void cut(){
        System.out.println("Нарезание пиццы клиньями");
    }

    void box(){
        System.out.println("Пиццу кладут в официальную коробку магазина пиццы");
    }

    public String getName(){
        return name;
    }
}
