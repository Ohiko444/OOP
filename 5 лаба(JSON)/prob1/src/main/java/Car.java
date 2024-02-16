import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Car {
    private String model; // модель
    private int year;  // год
    private double mileage; // пробег, км
    private String color; // цвет

    public Car() {
    }

    public Car(String model, int year, double mileage, String color) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                '}';
    }

}

