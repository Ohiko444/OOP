package one;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Catalog {
    private List catalog;
    public Catalog() {
        catalog = new LinkedList();
    }

    public void addCatalog(int price, String model, VehiclesSpec spec) {

        Vehicles vehicles = null;
        if (spec instanceof CarSpec){
            vehicles = new Car(price, model, (CarSpec) spec);
        } else if (spec instanceof BikeSpec){
            vehicles = new Bike(price, model, (BikeSpec) spec);
        }
        //здесь нужно будет добавить код, для проверки и добавления новых полей спецтехники
        catalog.add(vehicles);
    }

    public List<Car> search(CarSpec searchCar){
        List<Car> matchingCar = new LinkedList<Car>();
        for (Iterator i = catalog.iterator(); i.hasNext(); ) {
            Car car = (Car) i.next();
            if (car.getSpec().matches(searchCar)) {
                matchingCar.add(car);
            }
        }
        return matchingCar;
    }

    public List<Bike> search(BikeSpec searchBike){
        List<Bike> matchingBike = new LinkedList<Bike>();
        for (Iterator i = catalog.iterator(); i.hasNext(); ) {
            Bike bike = (Bike) i.next();
            if (bike.getSpec().matches(searchBike)) {
                matchingBike.add(bike);
            }
        }
        return matchingBike;
    }

    //добавить метод search для спецтехники

}
