package two;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        initializeCar(catalog);

        Map properties = new HashMap();
        properties.put("engineType", EngineType.HYBRID);
        properties.put("transmission", Transmission.AT);
        properties.put("colour", Colour.RED);
        VehiclesSpec car = new VehiclesSpec(properties);

        List vehiclesList = catalog.search(car);

        if (!vehiclesList.isEmpty()){
            System.out.println("Вам могут понравиться эти транспортные средства:");
            for (Iterator i = vehiclesList.iterator(); i.hasNext(); ){
                Vehicles vehicles = (Vehicles) i.next();
                VehiclesSpec spec = vehicles.getSpec();
                System.out.println("У нас есть: " + spec.getProperty("модель"));
                for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext(); ){
                    String propertyName = (String) j.next();
                    if (propertyName.equals("bodyType")){
                        continue;
                    }
                    System.out.println("   " + propertyName + ": " + spec.getProperty(propertyName));
                }
                System.out.println("Вы можете получчить это: " + spec.getProperty("bodyType") + " for $" + vehicles.getPrice() + "\n---");
            }
        } else {
            System.out.println("нет");
        }

    }

    private static void initializeCar(Catalog catalog) {

        Map properties = new HashMap();
        properties.put("vehiclesType", VehiclesType.CAR);
        properties.put("bodyType", BodyType.WAGON);
        properties.put("engineType", EngineType.HYBRID);
        properties.put("transmission", Transmission.AT);
        properties.put("color", Colour.RED);
        catalog.addCatalog(1000000, "Toyota Prius Alpha", new VehiclesSpec(properties));

        properties.put("vehiclesType", VehiclesType.CAR);
        properties.put("bodyType", BodyType.WAGON);
        properties.put("engineType", EngineType.HYBRID);
        properties.put("transmission", Transmission.AT);
        properties.put("color", Colour.RED);
        catalog.addCatalog(1000000, "Toyota Prius Alpha", new VehiclesSpec(properties));

        //catalog.addCatalog(500000, "Lada Kalina", new CarSpec(BodyType.HATCHBACK, EngineType.ICE_GAS, Transmission.MT, Colour.BLACK));
        //catalog.addCatalog(500000, "Nissan Serena V", new CarSpec(BodyType.MINIVAN, EngineType.ICE_GASOLINE, Transmission.AT, Colour.YELLOW));
        //catalog.addCatalog(500000, "Chevrolet Camaro VI", new CarSpec(BodyType.COUPE, EngineType.ICE_DIESEL, Transmission.MT, Colour.BLUE));
        //catalog.addCatalog(500000, "Mercedes-Benz", new CarSpec(BodyType.SEDAN, EngineType.ELECTRIC, Transmission.AT, Colour.WHITE));
    }


}
