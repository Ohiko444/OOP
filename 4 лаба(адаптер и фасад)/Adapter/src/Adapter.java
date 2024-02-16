public class Adapter implements Target{
    AmericMade americMade;

    public Adapter(AmericMade americMade){
        this.americMade = americMade;
    }

    public double getTemperature(){
        return americMade.getFahrenheiteTemperature() / 1.8 - 32;
    }
    public double getWeight(){
        return americMade.getWeightInPounds() * 0.45359237;
    }
    public double getSize(){
        return americMade.getSizeInFeet() / 3.281;
    }

    public void display() {
        System.out.println("Температура из F в С = " + decimalFormat.format(getTemperature()) + " масса из фунтов в кг = " + decimalFormat.format(getWeight()) + " размер из футов в м = " + decimalFormat.format(getSize()));
    }
}
