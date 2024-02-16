public class PlusMeasure implements Target{
    double temp;
    double weight;
    double size;
    public PlusMeasure(double temp, double weight, double size){
        this.temp = temp;
        this.weight = weight;
        this.size = size;
    }



    public double getTemperature(){return temp * 1.1;}

    public double getWeight(){return weight * 1.1;}

    public double getSize(){return size * 1.1;}

    public void display() {
        System.out.println("Температура C = " + decimalFormat.format(getTemperature()) + " масса в кг = " + decimalFormat.format(getWeight()) + " размер в м = " + decimalFormat.format(getSize()));
    }
}
