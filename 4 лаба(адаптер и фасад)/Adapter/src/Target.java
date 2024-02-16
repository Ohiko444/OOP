import java.text.DecimalFormat;
import java.util.Random;

public interface Target {
    DecimalFormat decimalFormat = new DecimalFormat( "#.####" );

    public double getTemperature();
    public double getWeight();
    public double getSize();
    public void display();
}
