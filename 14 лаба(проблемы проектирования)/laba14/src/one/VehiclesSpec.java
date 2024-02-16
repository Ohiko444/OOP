package one;

public abstract class VehiclesSpec {

    private EngineType engineType;
    private Transmission transmission;
    private Colour colour;

    public VehiclesSpec(EngineType engineType, Transmission transmission, Colour colour) {

        this.engineType = engineType;
        this.transmission = transmission;
        this.colour = colour;
    }

    public boolean matches(VehiclesSpec spec){
        if (engineType != spec.engineType) {
            return false;
        }
        if (transmission != spec.transmission) {
            return false;
        }
        if (colour != spec.colour) {
            return false;
        }
        //если клиент захотел добавить пораметры, то дописываем новую проверку
        return true;
    }

    public Colour getColour() {return colour;}
    public void setColour(Colour colour) {this.colour = colour;}
    public Transmission getTransmission() {return transmission;}
    public void setTransmission(Transmission transmission) {this.transmission = transmission;}
    public EngineType getEngineType() {return engineType;}
    public void setEngineType(EngineType engineType) {this.engineType = engineType;}

}
