public class DvdPlayer {
    Amplifier amplifier;

    public void on(){
        System.out.println(toString() + "DVD плеер включен");
    }

    public void off(){
        System.out.println(toString() + "DVD плеер выключен");
    }

    public void eject(){
        System.out.println(toString() + "извлечение DVD-плеера");
    }

    public void pause(){
        System.out.println(toString() + "DVD плеер поставлен на паузу");
    }

    public void play(){
        System.out.println(toString() + "DVD плеер снова воспроизводиться");
    }

    public void play(String movie){
        System.out.println(toString() + "DVD плеер воспроизводит " + movie);
    }

    public void setSurroundAudio(){
        System.out.println(toString() + "включен объемный звук");
    }

    public void setTwoChannelAudio(){
        System.out.println(toString() + "включен двухканальный звук");
    }

    public void stop(){
        System.out.println(toString() + "DVD плеер остановился ");
    }

    public String toString(){
        return "Top-O-Line ";
    }
}
