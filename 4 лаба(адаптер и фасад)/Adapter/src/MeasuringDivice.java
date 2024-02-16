import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class MeasuringDivice{

    public static void srar(ArrayList<Target> koll){
        DecimalFormat decimalFormat = new DecimalFormat( "#.####" );

        double sumt = 0, sumw = 0, sums = 0;
        double maxt = -50, maxw = -50, maxs = -50;
        double mint = 115, minw = 1100, mins = 1.5;

        for (int i = 0; i < koll.size(); i++){
            sumt += koll.get(i).getTemperature();
            sumw += koll.get(i).getWeight();
            sums += koll.get(i).getSize();
            if (koll.get(i).getTemperature() > maxt){maxt = koll.get(i).getTemperature();}
            if (koll.get(i).getWeight() > maxw){maxw = koll.get(i).getWeight();}
            if (koll.get(i).getSize() > maxs){maxs = koll.get(i).getSize();}
            if (koll.get(i).getTemperature() < mint){mint = koll.get(i).getTemperature();}
            if (koll.get(i).getWeight() < minw){minw = koll.get(i).getWeight();}
            if (koll.get(i).getSize() < mins){mins = koll.get(i).getSize();}
        }
        System.out.println("Среднее арифметическое температур = " + decimalFormat.format(sumt/3) + " масс = " + decimalFormat.format(sumw/3) + " размеров = " + decimalFormat.format(sums/3));
        System.out.println("Максимальная температура = " + decimalFormat.format(maxt) + " максимальная масса = " + decimalFormat.format(maxw) + " максимальный размер = " + decimalFormat.format(maxs));
        System.out.println("Минимальная температура = " + decimalFormat.format(mint) + " минимальная масса = " + decimalFormat.format(minw) + " минимальный размер = " + decimalFormat.format(mins));
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Target> koll = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            double temp = rnd.nextDouble(-50, 100);
            double weight = rnd.nextDouble(0, 1000);
            double size = rnd.nextDouble(0, 1);

            PlusMeasure a = new PlusMeasure(temp, weight, size);
            MinusMeasure b = new MinusMeasure(temp, weight, size);

            double tempF = rnd.nextDouble(-45, 212);
            double weightF = rnd.nextDouble(0, 2204);
            double sizeF = rnd.nextDouble(0, 3.281);

            AmericMade c0 = new AmericMade(tempF, weightF, sizeF);
            Target c = new Adapter(new AmericMade(tempF, weightF, sizeF));
            a.display();
            b.display();
            c.display();
            c0.display();
            koll.add(a);
            koll.add(b);
            koll.add(c);
            System.out.println("-----------------------------------------------------------------");
        }

        System.out.println("----------------------------------------------------------------------\n");
        srar(koll);
    }
}
