package pizza3;

public interface Sauce {
    public String toString();
}
class MarinaraSauce implements Sauce{
    public String toString(){
        return "соус Маринара";
    }
}

class PlumTomatoSauce implements Sauce{
    public String toString(){
        return "сливочно-томатный соус";
    }
}