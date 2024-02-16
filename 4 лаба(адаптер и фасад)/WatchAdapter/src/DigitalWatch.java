public class DigitalWatch implements Watch{
    int hour;
    int minutes;
    int seconds;

    public DigitalWatch(int hour, int minutes, int seconds){
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void display() {
        System.out.println("Время по цифровым часам: \nЧасы: " + hour + "\nМинуты: " + minutes + "\nСекунды: " + seconds);
    }
}
