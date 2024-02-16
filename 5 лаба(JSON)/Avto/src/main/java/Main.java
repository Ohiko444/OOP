import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Katalog katalog = new Katalog();

        ArrayList<Car> cars = Katalog.cars();

        try {
            Car car = mapper.readValue(new File("requirements.json"), Car.class);
            Car whatCar = katalog.search(car);
            if (whatCar == null){
                System.out.println("Вам не подошёл ни один автомобиль");
            } else {
                System.out.println("Вам подходит автомобиль:\n");
                System.out.println(whatCar);
            }
        } catch (IOException error) {
            error.printStackTrace();
        }


    }
}
