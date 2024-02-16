import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest1Cars {
    public static void main(String[] args) {
        //создание объекта для сериализации в JSON
        Car[] cars = {
                new Car("Zaz968", 1969, 400000, "white"),
                new Car("Vaz2101", 1975, 600000, "red"),
                new Car("Gaz24", 1989, 300000, "black"),
                new Car("Kamaz5320", 1985, 120000, "green"),
        };

        Car c = new Car("Kamaz5320", 1985, 120000, "green");

        //это объект Jackson, который выполняет сериализацию
        ObjectMapper mapper = new ObjectMapper();
        // сама сериализация: 1-куда, 2-что

        //запись в файл
        try {
            mapper.writeValue(new File("car1.json"), c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //вывод на экран
        try {
            Car car = mapper.readValue(new File("car1.json"), Car.class);
            System.out.println(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            mapper.writeValue(new File("cars.json"), cars);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Car[] carss = mapper.readValue(new File("cars.json"), Car[].class);
            System.out.println(Arrays.toString(carss));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ArrayList<Car> carss = mapper.readValue(new File("cars.json"), mapper.getTypeFactory().constructCollectionType(List.class, Car.class));
            System.out.println(carss);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
