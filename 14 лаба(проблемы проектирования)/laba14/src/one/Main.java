package one;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalog inventory=new Catalog();

        inventory.addCatalog(150000000,"BMW",new CarSpec(BodyType.SEDAN, EngineType.HYBRID, Transmission.MT, Colour.RED));
        inventory.addCatalog(200000000, "Toyota", new CarSpec(BodyType.HATCHBACK, EngineType.ELECTRIC, Transmission.AT, Colour.YELLOW));
        inventory.addCatalog(34000000, "Lada", new CarSpec(BodyType.COUPE, EngineType.ICE_DIESEL, Transmission.MT, Colour.BLACK));

        inventory.addCatalog(60000000, "HONDA", new BikeSpec(BodyTypeBike.NAKED, EngineType.HYBRID, Transmission.MT, Colour.RED));
        inventory.addCatalog(20000000, "MV", new BikeSpec(BodyTypeBike.SPORT, EngineType.ICE_GAS, Transmission.AT, Colour.WHITE));
        inventory.addCatalog(40000000, "KAWASAKI", new BikeSpec(BodyTypeBike.TOURIST, EngineType.ICE_GASOLINE, Transmission.AT, Colour.BLACK));


        CarSpec searchCar = new CarSpec(null,null,null, Colour.RED);
        List transports=inventory.search(searchCar);
        Search(transports);
        System.out.println();
        BikeSpec motorbikeSpec=new BikeSpec(BodyTypeBike.NAKED,null,null, null);
        transports=inventory.search(motorbikeSpec);
        Search(transports);

    }
    public static void Search(List  transports){
        if (!transports.isEmpty()) {
            System.out.println("Мы нашли то,что вам подходит!");
            for (Iterator i = transports.iterator(); i.hasNext(); ) {
                Vehicles transport = (Vehicles) i.next();
                VehiclesSpec transportSpec = transport.getSpec();
                if (transportSpec instanceof CarSpec) {
                    System.out.println("Модель машины: " + transport.getModel() + " Кузов: " + ((CarSpec) transportSpec).getBodyType() + " Двигатель: " + transportSpec.getEngineType() + " Трансмиссия: " + transportSpec.getTransmission() + " Цвет: " + transportSpec.getColour() + " Цена: " + transport.getPrice());
                }
                else if (transportSpec instanceof BikeSpec) {
                    System.out.println("Модель мотоцикла: " + transport.getModel() + " Класс: " + ((BikeSpec) transportSpec).getBodyType() + " Двигатель: " + transportSpec.getEngineType() + " Трансмиссия: " + transportSpec.getTransmission() + " Цвет: " + transportSpec.getColour() + " Цена: " + transport.getPrice());
                }
            }
        }
        else {
            System.out.println("К сожалению,у нас нет для вас подходящих вариантов.");
        }
    }
}
