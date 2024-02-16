public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        
        System.out.println("------------------------------------------------------------------------------------");
        weatherData.setMeasurements(20, 50, 760);
        weatherData.setMeasurements(32, 15, 764);
        weatherData.setMeasurements(7, 65, 756);
        weatherData.deleteObserver(heatIndexDisplay);
        weatherData.setMeasurements(21, 30, 761);


    }
}
