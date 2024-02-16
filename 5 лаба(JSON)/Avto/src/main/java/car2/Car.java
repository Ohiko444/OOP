package car2;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Car {
    //если клиент желает добавить поиск по другим параметрам, то создаем новые поля, изменяем конструктор и добавляем геттеры и сеттеры
    private int price;
    private String model;
    private CarSpec spec;

    Car(){}

    public Car(CarSpec spec, String model, int price){
        this.spec = spec;
        this.model = model;
        this.price = price;
    }

    public String toString(){return "Модели: " + model + "\nПо цене: " + price;}

    public int getPrice() {return price;}
    public String getModel() {return model;}
    public CarSpec getSpec() {
        return spec;
    }
}
