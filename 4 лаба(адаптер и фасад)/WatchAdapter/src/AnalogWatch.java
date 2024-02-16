public class AnalogWatch {
    int degreeHour;
    int degreeMinutes;
    int degreeSeconds;

    public AnalogWatch(int degreeHour, int degreeMinutes, int degreeSeconds){
        this.degreeHour = degreeHour;
        this.degreeMinutes = degreeMinutes;
        this.degreeSeconds = degreeSeconds;
    }

    public int perHour() {
        return degreeHour;
    }

    public int perMinutes() {
        return degreeMinutes;
    }

    public int perSeconds() {
        return degreeSeconds;
    }

    public void display(){
        System.out.println("Градусы для \nЧасов: " + perHour() +"\nМинут: " + perMinutes() + "\nСекунд: " + perSeconds());
    }

}
