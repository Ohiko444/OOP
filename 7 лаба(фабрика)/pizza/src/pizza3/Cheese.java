package pizza3;

public interface Cheese {
    public String toString();

}
class MozzarellaCheese implements Cheese{
    public String toString(){
        return "сыр Моцарелла";
    }
}

class ReggianoCheese implements Cheese{
    public String toString(){
        return "сыр Реджано";
    }
}