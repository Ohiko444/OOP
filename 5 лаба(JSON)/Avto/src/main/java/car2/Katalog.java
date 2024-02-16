package car2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Katalog {
    private List<Car> cars;
    public Katalog() {
        cars = new LinkedList<Car>();
    }

    public void addCar(BodyType bodyType, EngineType engineType, Transmission transmission, Colour colour, String model, int price) {
        Car car = new Car(new CarSpec(bodyType, engineType, transmission, colour), model, price);
        cars.add(car);
    }

    public List<Car> search(CarSpec searchCar){
        List<Car> matchingCar = new LinkedList<Car>();
        for (Iterator<Car> i = cars.iterator(); i.hasNext(); ) {
            Car car = (Car) i.next();
            if (car.getSpec().matches(searchCar)) {
                matchingCar.add(car);
            }
        }
        return matchingCar;
    }

    public List<Car> getCars() {
        return cars;
    }
}
