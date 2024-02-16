package pizza1;

public class CheesePizza implements Pizza {

    public String prepare() {
        return "Сырную пиццу собирают...";
    }

    public String bake() {
        return "\nСырную пиццу пекут...";
    }

    public String cut() {
        return "\nСырную пиццу режут...";
    }

    public String box() {
        return "\nСырную пиццу упаковывают";
    }

    public String toString(){
        return prepare() + bake() + cut() + box();
    }
}
