public class ForecastDisplay implements Observer, DisplayElement{
    private float pressure;
    private Subject wetherData;

    public ForecastDisplay(Subject wetherData){ //регистрация элемента в качестве наблюдателя
        this.wetherData = wetherData;
        wetherData.registerObserver(this);
    }
    public void update(float temp, float humidity, float pressure) {
        this.pressure = pressure;
        display();
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
