public class WatchAdapter implements Watch{
    AnalogWatch analogWatch;

    public WatchAdapter(AnalogWatch analogWatch) {
        this.analogWatch = analogWatch;
    }

    public int getHour() {
        return analogWatch.perHour()/30;
    }

    public int getMinutes() {
        return analogWatch.perMinutes()/6;
    }

    public int getSeconds() {
        return analogWatch.perSeconds()/6;
    }

    public void display(){
        System.out.println("Перевод градусов в часы: \nЧасы: " + getHour() +"\nМинуты: " + getMinutes() + "\nСекунды: " + getSeconds());
    }
}
