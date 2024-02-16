public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float mintemp;
    private float maxtemp;
    private float avgtemp;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure) {
        this.mintemp = Math.min(this.mintemp, temperature);
        if (mintemp == 0){
            this.mintemp = temperature;
        }
        this.maxtemp = Math.max(this.maxtemp, temperature);
        if (maxtemp == 0){
            this.maxtemp = temperature;
        }
        this.avgtemp = (mintemp + maxtemp) / 2;
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min температура = " + avgtemp +"/" + maxtemp + "/" + mintemp );
    }
}
