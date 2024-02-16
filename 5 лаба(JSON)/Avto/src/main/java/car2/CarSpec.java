package car2;

public class CarSpec {
    private BodyType bodyType;
    private EngineType engineType;
    private Transmission transmission;
    private Colour colour;

    public CarSpec(){}

    public CarSpec(BodyType bodyType, EngineType engineType, Transmission transmission, Colour colour){
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.transmission = transmission;
        this.colour = colour;
    }

    public boolean matches(CarSpec carSpec){
        if (bodyType != carSpec.bodyType) {
            return false;
        }
        if (engineType != carSpec.engineType) {
            return false;
        }
        if (transmission != carSpec.transmission) {
            return false;
        }
        if (colour != carSpec.colour) {
            return false;
        }
        //если клиент захотел добавить пораметры, то дописываем новую проверку
        return true;
    }

    public String toString(){
        return bodyType.toString() + ", " + engineType.toString() + ", "  + transmission.toString() + ", "  + colour.toString();
    }

    public Colour getColour() {return colour;}
    public void setColour(Colour colour) {this.colour = colour;}
    public Transmission getTransmission() {return transmission;}
    public void setTransmission(Transmission transmission) {this.transmission = transmission;}
    public EngineType getEngineType() {return engineType;}
    public void setEngineType(EngineType engineType) {this.engineType = engineType;}
    public BodyType getBodyType() {return bodyType;}
    public void setBodyType(BodyType bodyType) {this.bodyType = bodyType;}
}
