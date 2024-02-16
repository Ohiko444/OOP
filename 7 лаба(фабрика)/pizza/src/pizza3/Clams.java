package pizza3;

public interface Clams {
    public String toString();
}
class FreshClams implements Clams{
    public String toString(){
        return "свежие моллюски";
    }
}

class FrozenClams implements Clams{
    public String toString(){
        return "замороженные моллюски";
    }
}