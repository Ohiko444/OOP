import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float mintemp;
    private float maxtemp;
    private float avgtemp;

    Observable observable;

    public StatisticsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.mintemp = Math.min(this.mintemp, weatherData.getTemperature());
            if (mintemp == 0) {
                this.mintemp = weatherData.getTemperature();
            }
            this.maxtemp = Math.max(this.maxtemp, weatherData.getTemperature());
            if (maxtemp == 0) {
                this.maxtemp = weatherData.getTemperature();
            }
            this.avgtemp = (mintemp + maxtemp) / 2;
            this.temperature = weatherData.getTemperature();
            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min температура = " + avgtemp +"/" + maxtemp + "/" + mintemp );
    }

}
