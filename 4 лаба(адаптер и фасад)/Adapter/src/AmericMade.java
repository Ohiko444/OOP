import java.text.DecimalFormat;
import java.util.Random;

public class AmericMade {
    DecimalFormat decimalFormat = new DecimalFormat( "#.####" );
    private double temp;
    private double weight;
    private  double size;
    public AmericMade(double temp, double weight, double size){
        this.temp = temp;
        this.weight = weight;
        this.size = size * 3.281;
    }
    public double getFahrenheiteTemperature(){
        return temp;
    }

    public double getWeightInPounds(){
        return weight;
    }

    public double getSizeInFeet(){
        return size;
    }

    public void display() {
        System.out.println("///Температура F = " + decimalFormat.format(getFahrenheiteTemperature()) + " масса в фунтах = " + decimalFormat.format(getWeightInPounds()) + " размер в футах = " + decimalFormat.format(getSizeInFeet()) + "///");
    }
}
