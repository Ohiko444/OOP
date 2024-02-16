package pizza3;

public interface Veggies {
    public String toString();



}
class BlackOlives implements Veggies{
    public String toString(){
        return "черные оливки";
    }
}

class Mushroom implements Veggies{
    public String toString(){
        return "грибы";
    }
}

class Spinach implements Veggies{
    public String toString(){
        return "шпинат";
    }
}

class Onion implements Veggies{

    public String toString(){
        return "лук";
    }
}

class Garlic implements Veggies{

    public String toString(){
        return "чеснок";
    }
}

class EggPlant implements Veggies{

    public String toString(){
        return "баклажан";
    }
}

class RedPepper implements Veggies{
    public String toString(){
        return "красный перец";
    }
}