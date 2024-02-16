public class MinusMeasure implements Target{

    double temp;
    double weight;
    double size;
    public MinusMeasure(double temp, double weight, double size){
        this.temp = temp;
        this.weight = weight;
        this.size = size;
    }

    public double getTemperature(){return temp * 0.9;}

    public double getWeight(){
        weight = weight * 0.9;
        if (weight < 0){
            weight = 0;
        }
        return weight;
    }

    public double getSize(){
        size = size * 0.9;
        if (size < 0){
            size = 0;
        }
        return size;
    }

    public void display() {
        System.out.println("Температура C = " + decimalFormat.format(getTemperature()) + " масса в кг = " + decimalFormat.format(getWeight()) + " размер в м = " + decimalFormat.format(getSize()));
    }
}
