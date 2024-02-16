package Car;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Тип машины: " + carType + "\n";
        info += "Количество мест: " + seats + "\n";
        info += "Объём двигателя - " + engine.getVolume() + " л; пробег - " + engine.getMileage() + " км\n";
        info += "Коробка передач: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Бортовой компьютер: есть" + "\n";
        } else {
            info += "Бортовой компьютер: недоступен" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS навигатор: есть" + "\n";
        } else {
            info += "GPS навигатор: недоступен" + "\n";
        }
        return info;
    }
}
