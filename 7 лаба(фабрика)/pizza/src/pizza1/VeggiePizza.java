package pizza1;

public class VeggiePizza implements Pizza {

    public String prepare() {
        return "Вегетарианскую пиццу собирают...";
    }

    public String bake() {
        return "\nВегетарианскую пиццу пекут...";
    }

    public String cut() {
        return "\nВегетарианскую пиццу режут...";
    }

    public String box() {
        return "\nВегетарианскую пиццу упаковывают";
    }

    public String toString(){
        return prepare() + bake() + cut() + box();
    }
}
