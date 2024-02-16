public class Projector {
    DvdPlayer dvdPlayer;

    public void on(){
        System.out.println(toString() + "проектор включен");
    }

    public void off(){
        System.out.println(toString() + "проектор выключен");
    }

    public void tvMode(){
        System.out.println(toString() + "включен формат телевизора");
    }

    public void wideScreenMode(){
        System.out.println(toString() + "включен полноэкранный режим");
    }

    public String toString(){
        return "Top-O-Line ";
    }

}
