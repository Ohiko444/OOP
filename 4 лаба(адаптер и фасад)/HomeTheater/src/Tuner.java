public class Tuner {
    Amplifier amplifier;

    public void on(){
        System.out.println(toString() + "радио включено");
    }

    public void off(){
        System.out.println(toString() + "аудио выключено");
    }

    public void setAm(Amplifier amplifier){
        this.amplifier = amplifier;
        System.out.println(toString() + "настройка усилителя для радио");
    }

    public void setFm(){
        System.out.println(toString() + "настройка радио");
    }

    public void setFrequency(){
        System.out.println(toString() + "настройка частоты радио");
    }

    public String toString(){
        return "Top-O-Line ";
    }
}
