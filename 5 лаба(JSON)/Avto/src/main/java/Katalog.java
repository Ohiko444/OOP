import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Katalog {

    public static ArrayList<Car> cars() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File("katalog.json"), mapper.getTypeFactory().constructCollectionType(List.class, Car.class));
        } catch (IOException error) {
            error.printStackTrace();
        }
        return null;
    }

    public Car search(Car searchCar){
        for (Car avto: cars()){
            Car car = avto;
            if (searchCar.getBodyType() != car.getBodyType()){
                continue;
            }
            if (searchCar.getEngineType() != car.getEngineType()){
                continue;
            }
            if (searchCar.getTransmission() != car.getTransmission()){
                continue;
            }
            if (searchCar.getColour() != car.getColour()){
                continue;
            }
            //если клиент захотел добавить пораметры, то дописываем новую проверку
            return car;
        }
        return null;
    }
}
