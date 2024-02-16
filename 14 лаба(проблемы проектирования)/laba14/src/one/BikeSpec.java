package one;

public class BikeSpec extends VehiclesSpec{

    private BodyTypeBike bodyType;

    public BikeSpec(BodyTypeBike bodyType, EngineType engineType, Transmission transmission, Colour colour){
        super(engineType, transmission, colour);
        this.bodyType = bodyType;
    }

    public boolean matches(VehiclesSpec spec){
        if (!super.matches(spec)) {
            return false;
        }
        if (!(spec instanceof BikeSpec)) {
            return false;
        }
        BikeSpec spec1 = (BikeSpec) spec;
        if (bodyType != spec1.bodyType) {
            return false;
        }
        return true;
    }

    //public String toString(){return bodyType.toString() + ", " + engineType.toString() + ", "  + transmission.toString() + ", "  + colour.toString();}

    public BodyTypeBike getBodyType() {return bodyType;}
    public void setBodyType(BodyTypeBike bodyType) {this.bodyType = bodyType;}

}
