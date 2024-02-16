public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.registerObserver(new HeatIndexDisplay());

        System.out.println("------------------------------------------------------------------------------------");
        weatherData.setMeasurements(20, 50, 760);
        weatherData.setMeasurements(32, 15, 764);
        weatherData.setMeasurements(7, 65, 756);
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(21, 30, 761);


    }
}
