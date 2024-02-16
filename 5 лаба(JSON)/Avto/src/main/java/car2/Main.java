package car2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Katalog katalog = new Katalog();
        initializeCar(katalog);

        try {
            CarSpec car = mapper.readValue(new File("requirements.json"), CarSpec.class);
            List<Car> whatCar = katalog.search(car);
            System.out.println("Ваши пожелания: \n" + car.toString());
            System.out.println("------------------------------------------------");
            if (whatCar.isEmpty()){
                System.out.println("Вам не подошёл ни один автомобиль");
            } else {
                System.out.println("Вам подходит автомобиль:");
                for (Car avto: whatCar){
                    System.out.println(avto);
                }
            }
        } catch (IOException error) {
            error.printStackTrace();
        }
    }

    private static void initializeCar(Katalog katalog) {
        katalog.addCar(BodyType.WAGON,EngineType.HYBRID, Transmission.AT, Colour.RED, "Toyota Prius Alpha",1000000);
        katalog.addCar(BodyType.HATCHBACK,EngineType.ICE_GAS, Transmission.MT, Colour.BLACK, "Lada Kalina",500000);
        katalog.addCar(BodyType.MINIVAN,EngineType.ICE_GASOLINE, Transmission.AT, Colour.YELLOW, "Nissan Serena V",500000);
        katalog.addCar(BodyType.COUPE,EngineType.ICE_DIESEL, Transmission.MT, Colour.BLUE, "Chevrolet Camaro VI",500000);
        katalog.addCar(BodyType.SEDAN,EngineType.ELECTRIC, Transmission.AT, Colour.WHITE, "Mercedes-Benz",500000);
    }
}
