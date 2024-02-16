package pizza3;

public interface Pepperoni {
    public String toString();
}
class SlicedPepperoni  implements Pepperoni{
    public String toString(){
        return "нарезанные пепперони";
    }
}