public class CdPlayer {
    Amplifier amplifier;

    public void on(){
        System.out.println(toString() + "CD плеер включен");
    }

    public void off(){
        System.out.println(toString() + "CD плеер выключен");
    }

    public void eject(){
        System.out.println(toString() + "диск извлечен");
    }

    public void pause(){
        System.out.println(toString() + "CD плеер поставден на паузу");
    }

    public void play(String movie){
        System.out.println(toString() + "Воспроизводится фильм " + movie);
    }

    public void play(){
        System.out.println(toString() + "CD плеер снова воспроизводиться");
    }

    public void stop(){
        System.out.println(toString() + "CD плеер остановлен");
    }

    public String toString(){
        return "Top-O-Line ";
    }
}
