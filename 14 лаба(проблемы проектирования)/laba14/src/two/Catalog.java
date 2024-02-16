package two;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Catalog {
    private List catalog;
    public Catalog() {
        catalog = new LinkedList();
    }

    public void addCatalog(int price, String model, VehiclesSpec spec) {

        Vehicles vehicles = new Vehicles(price, model, spec);
        catalog.add(vehicles);
    }

    public List search(VehiclesSpec searchSpec){
        List matchingVehicle = new LinkedList();
        for (Iterator i = catalog.iterator(); i.hasNext(); ) {
            Vehicles vehicles = (Vehicles) i.next();
            if (vehicles.getSpec().matches(searchSpec)) {
                matchingVehicle.add(vehicles);
            }
        }
        return matchingVehicle;
    }
}
