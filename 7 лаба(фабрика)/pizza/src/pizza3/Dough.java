package pizza3;

public interface Dough {
    public String toString();
}
class ThickCrustDough implements Dough{
    public String toString(){
        return "тесто с толстой корочкой";
    }
}

class ThinCrustDough implements Dough{
    public String toString(){
        return "тесто с тонкой корочкой";
    }
}