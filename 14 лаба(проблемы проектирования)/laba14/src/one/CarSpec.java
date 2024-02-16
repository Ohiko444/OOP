package one;

public class CarSpec extends VehiclesSpec{
    private BodyType bodyType;

    public CarSpec(BodyType bodyType, EngineType engineType, Transmission transmission, Colour colour){
        super(engineType, transmission, colour);
        this.bodyType = bodyType;
    }

    @Override
    public boolean matches(VehiclesSpec spec){
        if (!super.matches(spec)) {
            return false;
        }
        if (!(spec instanceof CarSpec)) {
            return false;
        }
        CarSpec spec1 = (CarSpec) spec;
        if (bodyType != spec1.bodyType) {
            return false;
        }
        return true;
    }

    //public String toString(){return bodyType.toString() + ", " + engineType.toString() + ", "  + transmission.toString() + ", "  + colour.toString();}

    public BodyType getBodyType() {return bodyType;}
    public void setBodyType(BodyType bodyType) {this.bodyType = bodyType;}
}
