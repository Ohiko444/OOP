import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement{
    private float pressure;
    Observable observable;

    public ForecastDisplay(Observable observable){ //регистрация элемента в качестве наблюдателя
        this.observable = observable;
        observable.addObserver(this);
    }
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.pressure = weatherData.getPressure();
            display();
        }
    }
    public void display() {
        if (pressure >= 755 && pressure <=757){
            System.out.println("Погода дождливая, не забудте зонтик и потеплее одеться");
        }else if (pressure >=758 && pressure <= 762){
            System.out.println("Погода комфортная для человека, сходите обязательно прогуляться");
        }else if (pressure >= 763 && pressure <= 766){
            System.out.println("Погода жаркая, сходите на пляж, искупайтесь и не забудьте крем от загара и солнечные очки");
        }
    }


}
