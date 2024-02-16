import com.fasterxml.jackson.annotation.JsonAutoDetect;
@JsonAutoDetect
public class Car {
    //если клиент желает добавить поиск по другим параметрам, то создаем новые поля, изменяем конструктор и добавляем геттеры и сеттеры
    private int price;
    private BodyType bodyType;
    private EngineType engineType;
    private Transmission transmission;
    private Colour colour;
    private String model;

    Car(){}

    public Car(BodyType bodyType, EngineType engineType, Transmission transmission, Colour colour, String model, int price){
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.transmission = transmission;
        this.colour = colour;
        this.model = model;
        this.price = price;
    }

    public String toString(){
        return "Модели: " + model + "\nПо цене: " + price;
    }


    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public Colour getColour() {return colour;}
    public void setColour(Colour colour) {this.colour = colour;}
    public Transmission getTransmission() {return transmission;}
    public void setTransmission(Transmission transmission) {this.transmission = transmission;}
    public EngineType getEngineType() {return engineType;}
    public void setEngineType(EngineType engineType) {this.engineType = engineType;}
    public BodyType getBodyType() {return bodyType;}
    public void setBodyType(BodyType bodyType) {this.bodyType = bodyType;}
}
