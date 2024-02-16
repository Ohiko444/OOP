package two;

public class Vehicles {

    private int price;
    private String model;
    private VehiclesSpec spec;

    public Vehicles(int price, String model, VehiclesSpec spec) {
        this.price = price;
        this.model = model;
        this.spec = spec;
    }

    public VehiclesSpec getSpec(){return spec;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public String getModel() {return model;}
}
