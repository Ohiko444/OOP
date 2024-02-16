package pizza3;

import java.util.ArrayList;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake(){
        System.out.println("Выпекание 25 минут при температуре 350");
    }

    void cut(){
        System.out.println("Нарезание пиццы клиньями");
    }

    void box(){
        System.out.println("Пиццу кладут в официальную коробку магазина пиццы");
    }

    void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString() {
        String write = "***Состав: " + dough + ", " + sauce + ", " + cheese;
        if (veggies != null){
            for (Veggies veggie: veggies){
                write += ", " + veggie;
            }
        }
        if (pepperoni != null){
            write += ", " + pepperoni;
        }
        return "---------------------------------------------------------------------------------------\n" + write + "***\n---------------------------------------------------------------------------------------";
    }
}
