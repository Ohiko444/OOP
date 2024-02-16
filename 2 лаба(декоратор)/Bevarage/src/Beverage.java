public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    String description = "Unknow Bevarage";
    Size size = Size.TALL;

    public abstract double cost();

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public String getDescription() {
        return description;
    }

}
