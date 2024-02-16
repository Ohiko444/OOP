package pizza1;

public class ClamPizza implements Pizza {

    public String prepare() {
        return "Пиццу из морепродуктов собирают...";
    }

    public String bake() {
        return "\nПиццу из морепродуктов пекут...";
    }

    public String cut() {
        return "\nПиццу из морепродуктов режут...";
    }

    public String box() {
        return "\nПиццу из морепродуктов упаковывают";
    }

    public String toString(){
        return prepare() + bake() + cut() + box();
    }
}
