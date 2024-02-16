package pizza1;

public class PepperoniPizza implements Pizza {

    public String prepare() {
        return "Пепперони собирают...";
    }

    public String bake() {
        return "\nПепперони пекут...";
    }

    public String cut() {
        return "\nПепперони режут...";
    }

    public String box() {
        return "\nПепперони упаковывают";
    }

    public String toString(){
        return prepare() + bake() + cut() + box();
    }
}
